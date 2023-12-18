import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(solve());
	}

	static boolean solve() {
		int n = sc.nextInt();
		if (n == 0) {
			return false;
		}
		Vector2[] p = new Vector2[n];
		for(int i=0;i<n;i++) {
			p[i] = new Vector2(sc.nextInt(),sc.nextInt());
		}
		int tg = sc.nextInt();
		int tw = sc.nextInt();
		Vector2 s = new Vector2(sc.nextInt(),sc.nextInt());
		Vector2 t = new Vector2(sc.nextInt(),sc.nextInt());
		int ind = -1;
		for(int i=0;i<n;i++) {
			if (p[(i+1)%n].subtract(p[i]).cross(s.subtract(p[i])) == 0) {
				ind = i;
				break;
			}
		}
		double ans = Double.POSITIVE_INFINITY;
		double d1 = 0;
		for(int i=0;i<n-1;i++) {
			Vector2 p1 = i == 0 ? s : p[(ind+i)%n];
			Vector2 p2 = p[(ind+i+1)%n];
			if (p1.equals(p2)) {
				continue;
			}
			double d2 = d1 + p1.dist(p2);
			double a = calc(d1, d2, p1, p2, t, tg, tw);
//			System.out.println(" cc," + p1 + "/" + d1 + "->" + p2 + "/" + d2 + ":" + a);
			ans = Math.min(ans, a);
			d1 = d2;
		}
		d1 = 0;
		for(int i=0;i<n-1;i++) {
			Vector2 p1 = i == 0 ? s : p[(ind+n+1-i)%n];
			Vector2 p2 = p[(ind+n-i)%n];
			if (p1.equals(p2)) {
				continue;
			}
			double d2 = d1 + p1.dist(p2);
			double a = calc(d1, d2, p1, p2, t, tg, tw);
//			System.out.println(" c," + p1 + "/" + d1 + "->" + p2 + "/" + d2 + ":" + a);
			ans = Math.min(ans, a);
			d1 = d2;
		}
		System.out.printf("%.10f\n",ans);
		return true;
	}

	static double calc(double d1,double d2,Vector2 p1,Vector2 p2,Vector2 t,int tg,int tw) {
		double l = 0;
		double r = 1;
		for(int k=0;k<100;k++) {
			double x1 = (l * 2 + r) / 3;
			double x2 = (l + r * 2) / 3;
			double t1 = calc(x1, d1, d2, p1, p2, t, tg, tw);
			double t2 = calc(x2, d1, d2, p1, p2, t, tg, tw);
//			System.out.println("[" + l + "," + r + "]:" + x1 + ":" + t1 + "," + t2 + ":" + x2);
			if (t1 < t2) {
				r = x2;
			}else{
				l = x1;
			}
		}
		return calc((l+r)/2, d1, d2, p1, p2, t, tg, tw);
	}
	static double calc(double x,double d1,double d2,Vector2 p1,Vector2 p2,Vector2 t,int tg,int tw) {
		double lg = d1 * (1 - x) + d2 * x;
		double lw = p1.multiply(1-x).add(p2.multiply(x)).dist(t);
		return lg * tg + lw * tw;
	}

}
class Vector2 {
	public double x;
	public double y;
	public Vector2(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public double cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public double norm() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public Vector2 normalize() {
		return divide(norm());
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(x+v.x,y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(x-v.x,y-v.y);
	}
	public Vector2 multiply(double k) {
		return new Vector2(x*k,y*k);
	}
	public Vector2 divide(double k) {
		return new Vector2(x/k,y/k);
	}
	public Vector2 rotate90() {
		return new Vector2(-y,x);
	}
	public Vector2 rotate270() {
		return new Vector2(y,-x);
	}
	public double dist(Vector2 v) {
		double dx = v.x - x;
		double dy = v.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	public static Vector2 intersect(Vector2 r1,Vector2 d1,Vector2 r2,Vector2 d2) {
		return r1.add(d1.multiply(-d2.cross(r2.subtract(r1)) / d1.cross(d2)));
	}
	public static double dist(Vector2 r1,Vector2 r2,Vector2 p) {
		return r2.subtract(r1).normalize().cross(p.subtract(r1));
	}
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}