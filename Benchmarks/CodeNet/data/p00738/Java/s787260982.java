
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-10;
	P s, g;
	int n;
	double[] ds;
	double[] h;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			s = new P(sc.nextDouble(), sc.nextDouble());
			g = new P(sc.nextDouble(), sc.nextDouble());
			
			h = new double[n];
			ds = new double[n];
			
			for(int c=0;c<n;c++) {
				int[][] p = new int[2][2];
				for(int i=0;i<2;i++) for(int j=0;j<2;j++) p[i][j] = sc.nextInt();
				
				ds[c] = INF;
				for(int i=0;i<2;i++) for(int j=0;j<2;j++) {
					double tmp = disSP(s, g, new P(p[i][0], p[j][1]));
					ds[c] = min(tmp, ds[c]);
//					debug(ds);
					tmp = disSP ( new P(p[i][0], p[j][1]), new P(p[i][0], p[(j+1)%2][1]), s );
					ds[c] = min(tmp, ds[c]);
					
					tmp = disSP ( new P(p[i][0], p[j][1]), new P(p[(i+1)%2][0], p[j][1]), s );
					ds[c] = min(tmp, ds[c]);
					
					tmp = disSP ( new P(p[i][0], p[j][1]), new P(p[i][0], p[(j+1)%2][1]), g );
					ds[c] = min(tmp, ds[c]);
					
					tmp = disSP ( new P(p[i][0], p[j][1]), new P(p[(i+1)%2][0], p[j][1]), g );
					ds[c] = min(tmp, ds[c]);
//					debug(ds);
					
					if( cross(new P(p[i][0], p[j][1]), new P(p[(i+1)%2][0], p[j][1]), s, g) ) ds[c] = 0;
					if( cross(new P(p[i][0], p[j][1]), new P(p[i][0], p[(j+1)%2][1]), s, g) ) ds[c] = 0;
					
				}
				
				if( p[0][0] < min(s.x, g.x) && p[0][1] < min(s.y, g.y) && p[1][0] > max(s.x, g.x) && p[1][1] > max(s.y, g.y) )
					ds[c] = 0;
				
				h[c] = sc.nextDouble();
			}
			
			double l = 0 , r = 1000;
//			
//			debug(ds);
			
			while( l - EPS < r ) {
				double c = (l+r) / 2;
				if( r-l < EPS ) break;
				if(isHit(c)) r = c;
				else l = c;
			}
			
			System.out.printf("%.5f\n", l);
		}
	}
	
	boolean isHit(double r) {
		for(int i=0;i<n;i++) {
			double htmp = min(h[i], r);
			double d2 = ds[i] * ds[i];
			if( d2 < EPS ) d2 = 0;
			double dh = (r - htmp);
			dh *= dh;
			if( dh < EPS ) dh = 0;
			
			d2 += dh;
			d2 = sqrt(d2);
			
//			debug( d2, r );
			if( d2 + EPS < r ) return true; 
		}
		
		return false;
	}
	
	double disSP(P p1, P p2, P q) {
		if( p2.sub(p1).dot(q.sub(p1)) < EPS ) return q.sub(p1).d();
		if( p1.sub(p2).dot(q.sub(p2)) < EPS ) return q.sub(p2).d();
		return disLP(p1, p2, q);
	}
	
	double disLP(P p1, P p2, P q) {
		return abs(p1.sub(p2).det(q.sub(p2))) / p1.sub(p2).d();
	}
	
	boolean cross(P p1, P p2, P q1, P q2) {
		return ccw(p1, p2, q1) * ccw(p1, p2, q2) <= 0 &&
			ccw(q1, q2, p1) * ccw(q1, q2, p2) <= 0;
	}
	
	int ccw (P a, P b, P c) {
		P s = b.sub(a);
		P t = c.sub(a);
		if( s.det(t) > EPS ) return 1;
		if( s.det(t) < -EPS ) return -1;
		if( s.dot(t) < -EPS ) return 2;
		if( s.dot(s) + EPS < t.dot(t) ) return -2;
		return 0;
	}
	
	class P {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		P add(P p) {
			return new P(x+p.x, y+p.y);
		}
		
		P sub(P p) {
			return new P(x-p.x, y-p.y);
		}
		
		double dot(P p) {
			return x*p.x + y*p.y;
		}
		
		double det(P p) {
			return x*p.y - y*p.x;
		}
		
		double d() {
			double d = sqrt(x*x + y*y);
			if( d < EPS ) return 0;
			return d;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}