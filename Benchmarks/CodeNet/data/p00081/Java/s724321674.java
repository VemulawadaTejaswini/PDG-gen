import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    void tr(Object... os) {
        System.err.println(deepToString(os));
    }

    Scanner sc = new Scanner(System.in);
    public void run() {
        while (sc.hasNext()) {
            String[] ss = sc.nextLine().split(",");
            P a = new P(Double.parseDouble(ss[0]), Double.parseDouble(ss[1]));
            P b = new P(Double.parseDouble(ss[2]), Double.parseDouble(ss[3]));
            P p = new P(Double.parseDouble(ss[4]), Double.parseDouble(ss[5]));
            P p2 = symLP(a,b,p);
            System.out.printf("%.8f %.8f\n", p2.x, p2.y);
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
	P proj(P p, P b) {
		return b.mul(p.dot(b)).div(b.abs2());
	}
	P symLP(P a, P b, P p) {
		P of =proj(p.sub(a), b.sub(a));
		return new P(2 * a.x + 2 * of.x - p.x, 2 * a.y + 2 * of.y - p.y);
	}

}