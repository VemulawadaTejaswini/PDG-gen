import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	
	Scanner sc = new Scanner(System.in);
	void run() {
	
		P[] ps = new P[1024];
		ps[0] = new P(1, 0);
		
		P rot = new P(0, -1);
		for (int i = 1; i < ps.length; i++) {
			P p = ps[i-1];
			P v = p.normal().mul(-1).mul(rot);
			ps[i] = p.add(v);
		}
		for (;;) {
			int n = sc.nextInt();
			if (n == -1) break;
			System.out.printf("%.2f\n%.2f\n", ps[n-1].x, ps[n-1].y);
		}
	}
	
	static class P implements Comparable<P> {
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(P o) {
			return x != o.x ? Double.compare(x, o.x) : Double.compare(y, o.y);
		}
		public String toString() {
			return "(" + x + "," + y + ")";
		}
		public double abs() {return sqrt(x * x + y * y); }
		public double abs2() {return (x * x + y * y); }
		public double arg() { return atan2(y, x); } // (-pi 〜 pi)
		public double dist(P o) {return this.sub(o).abs(); }
		public P mul(double k) {return new P(x * k, y * k);}
		public P div(double k) {return new P(x / k, y / k);}
		public P add(P o) {return new P(x + o.x, y + o.y);}
		public P sub(P o) {return new P(x - o.x, y - o.y);}
		public P mul(P o) {return new P(x * o.x - y * o.y,  x * o.y + y * o.x); }
		public P div(P o) {return new P(x * o.x + y * o.y, -x * o.y + y * o.x).div(o.abs2()); }
		public double dot(P o) {return x * o.x + y * o.y;} // a b sin(t)
		public double det(P o) {return x * o.y - y * o.x;} // a b cos(t)
		public P normal() { return this.div(this.abs()); }
		public P rot90() { return new P(-y, x); }
		public static P polar(double d, double rad) {return new P(d * Math.cos(rad), d * Math.sin(rad));}
	}

}