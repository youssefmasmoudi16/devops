package point;
public class point {
	private float abscisse;
	private float ordonee;
	
	
	public point construire(float a,float b) {
		point p = null;
		abscisse=a;
		ordonee=b;
		return p;
	}
	
	
	public void afficher() {
		System.out.println("abscisse="+abscisse+" ordonee="+ordonee);
	}
	public void deplacer(float a,float b) {
		abscisse+=a;
		ordonee+=b;
	}
	public point() {}
	public point(float a,float b) {
		abscisse=a;
		ordonee=b;
	}
	public float getAbscisse() {return abscisse;}
	public float getOrdonee() {return ordonee;}
	public void setabscisse(float a) {abscisse=a;}
	public void setordonee(float b) {ordonee=b;}
	public String toString() {return ("abs="+abscisse+" ord="+ordonee);}
	public boolean equals(point p) {return (p.getAbscisse()==abscisse && p.getOrdonee()==ordonee);}
	public float distance(point p) {
		return (float)(Math.sqrt(Math.pow(p.getAbscisse()-abscisse,2 )+Math.pow(p.getOrdonee()-ordonee,2)));
		}
}
