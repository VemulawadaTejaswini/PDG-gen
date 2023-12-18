import java.util.Scanner;

class Vector {
	double x, y;

	public Vector(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class Main {
	static final Vector p1 = new Vector(0.0, 0.0),
			p2 = new Vector(100.0, 0.0);
	static final double angle60 = Math.toRadians(60);

	public static void kock(Vector a, Vector b, int n) {
		if (n == 0) {

		} else {
			n--;
			double sx = (a.x * 2.0 + b.x) / 3.0;
			double sy = (a.y * 2.0 + b.y) / 3.0;
			double tx = (a.x + b.x * 2.0) / 3.0;
			double ty = (a.y + b.y * 2.0) / 3.0;
			double ux = (tx - sx) * Math.cos(angle60) -
					(ty - sy) * Math.sin(angle60) + sx;
			double uy = (tx - sx) * Math.sin(angle60) +
					(ty - sy) * Math.cos(angle60) + sy;
			Vector s = new Vector(sx, sy);
			Vector t = new Vector(tx, ty);
			Vector u = new Vector(ux, uy);
			kock(a, s, n);
			printVec(s);
			kock(s, u, n);
			printVec(u);
			kock(u, t, n);
			printVec(t);
			kock(t, b, n);
		}
	}

	public static void printVec(Vector v) {
		System.out.println(v.x + " " + v.y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printVec(p1);
		kock(p1, p2, n);
		printVec(p2);
	}
}
