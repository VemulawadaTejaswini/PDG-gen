
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
			if ((n|m|l) == 0) break;
			m--; l--;

			Star[] stars = new Star[n];
			for (int i=0;i<n;i++) stars[i] = new Star(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

			double[][] d = new double[n][n];
			for (int i=0;i<n;i++) for (int j=i+1;j<n;j++) {
//				debug("star", i, j);
				d[i][j] = d[j][i] = stars[i].dist(stars[j]);
			}

			for (int k=0;k<n;k++) for (int i=0;i<n;i++) for (int j=0;j<n;j++)
				d[i][j] = min(d[i][j], d[i][k] + d[k][j]);

			System.out.println(d[m][l]);
		}
	}


	double distSS (P p1, P p2, P q1, P q2) {
		if (cross(p1, p2, q1, q2)) return 0.0;
		double min = INF;
		min = min(min, disSP(p1, p2, q1));
		min = min(min, disSP(p1, p2, q2));
		min = min(min, disSP(q1, q2, p1));
		min = min(min, disSP(q1, q2, p2));
		return min;
	}

	//テァツつケテ」ツ?ィテァツキツ堙・ツ按?」ツ?ョティツキツ敕ゥツ崢「
	double disSP(P p1, P p2, P q) {
		if( p2.sub(p1).dot(q.sub(p1)) < EPS ) return q.sub(p1).abs();
		if( p1.sub(p2).dot(q.sub(p2)) < EPS ) return q.sub(p2).abs();
		return disLP(p1, p2, q);
	}

	//テァツつケテ」ツ?ィテァツ崢エテァツキツ堙」ツ?ョティツキツ敕ゥツ崢「
	double disLP(P p1, P p2, P q) {
		return Math.abs(p2.sub(p1).det(q.sub(p1))) / p2.sub(p1).abs();
	}

	//テァツキツ堙・ツ按?、ツコツ、テ・ツキツョテ・ツ按、テ・ツョツ?
	boolean cross(P p1, P p2, P q1, P q2) {
		return ccw(p1, p2, q1) * ccw(p1, p2, q2) <= 0 &&
			ccw(q1, q2, p1) * ccw(q1, q2, p2) <= 0;
	}

	//テヲツ卍づィツィツ暗・ツ崢榲」ツつ甘」ツ?ェテ」ツ?ョテ」ツ?凝ッツシツ偲・ツ渉催ヲツ卍づィツィツ暗・ツ崢榲」ツつ甘」ツ?ェテ」ツ?ョテ」ツ?凝ッツシツ古ァツ崢エテァツキツ堙ァツ環カテ」ツ?ェテ」ツ?ョテ」ツ?凝ッツシツ古」ツ?ィテ」ツ?ォテ」ツ?凝」ツ?湘、ツスツ催ァツスツョテゥツ鳴「テ、ツソツづ」ツつ津」ツ?ソテ」ツつ?
	int ccw (P a, P b, P c) {
		P s = b.sub(a);
		P t = c.sub(a);
		if( s.det(t) > EPS ) return 1;
		if( s.det(t) < -EPS ) return -1;
		if( s.dot(t) < -EPS ) return 2;
		if( s.dot(s) + EPS < t.dot(t) ) return -2;
		return 0;
	}

	class Star {
		double[] x, y;
		Star(int px, int py, int sh, int r) {
			x = new double[5];
			y = new double[5];
			for (int i=0;i<5;i++) {
				x[i] = 1.0 * px - sin(1.0 * (i * 72 + sh) / 180.0 * PI) * r;
				y[i] = 1.0 * py + cos(1.0 * (i * 72 + sh) / 180.0 * PI) * r;
			}
		}

		double dist(Star s) {
			double min = INF;
			for (int i=0;i<5;i++) for (int j=0;j<5;j++ ) {
				P p1 = new P(x[i], y[i]), p2 = new P(x[(i+2)%5], y[(i+2)%5]),
				  q1 = new P(s.x[j], s.y[j]), q2 = new P(s.x[(j+2)%5], s.y[(j+2)%5]);
				min = min(min, distSS(p1, p2, q1, q2));
//				debug(i, j, min);
			}
			return min;
		}
	}

	public class P {
		double EPS = 1e-10;
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double add(double a, double b) {	//ティツェツ、テ・ツキツョテ」ツつ津ィツ?εヲツ?ョ
			if( Math.abs(a+b) < EPS * ( Math.abs(a) + Math.abs(b) ) ) return 0;
			return a + b;
		}

		P add(P p) {	//テ・ツ陳?
			return new P(x+p.x, y+p.y);
		}

		P sub(P p) {	//テ・ツキツョ
			return new P(x-p.x, y-p.y);
		}

		P mlt(double k) {
			return new P(x*k, y*k);
		}

		double dot(P p) {	//テ・ツ??ァツゥツ?
				return add(x*p.x, y*p.y);
		}

		double det(P p) {	//テ・ツ、ツ姪ァツゥツ?
			return add(x*p.y, -y*p.x);
		}

		//ティツキツ敕ゥツ崢「テァツウツサ
		double abs() {
			double ret = sqrt( add(x*x, y*y) );
			if ( Math.abs(ret) < EPS ) return 0;
			return ret;
		}

		double abs(P p) {
			double dx = add( x, -p.x );
			double dy = add( y, -p.y );
			double ret = sqrt( add(dx*dx, dy*dy) );
			if( Math.abs(ret) < EPS ) return 0;
			return ret;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}