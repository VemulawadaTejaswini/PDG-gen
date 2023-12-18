import java.util.*;
import java.awt.geom.*;

public class Main{
	int k = 101;
	double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Line2D [] list = new Line2D[n];
			for(int i = 0; i < n; i++){
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				Point2D p1 = new Point2D.Double(x1, y1);
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				Point2D p2 = new Point2D.Double(x2, y2);
				Point2D pvec = mul(k, sub(p2, p1));
				Point2D p2after = new Point2D.Double(pvec.getX() + p2.getX(), pvec.getY() + p2.getY());
				Point2D p1after = new Point2D.Double(pvec.getX() * -1 + p1.getX(), pvec.getY() * -1 + p1.getY());
				list[i] = new Line2D.Double(p1after, p2after);
			}
			int count = 1;
			for(int i = 0; i < n; i++){
				HashSet<Point2D> now = new HashSet<Point2D>();
				for(int j = i-1; j >= 0; j--){
					if(list[i].intersectsLine(list[j])){
						Point2D p = intersectPtSS(list[i], list[j]);
						now.add(p);
					}
				}
				count += 1 + now.size();
			}
			System.out.println(count);
		}
	}
	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lVec = sub(l.getP2(), l.getP1());
		Point2D mVec = sub(m.getP2(), m.getP1());
		Point2D m1l1Vec = sub(m.getP1(), l.getP1());
		double a = cross(m1l1Vec, lVec);
		double b = cross(lVec, mVec);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			//平行な直線同士の場合
			if(l.getP1().distance(m.getP1()) < EPS) return l.getP1();
			if(l.getP1().distance(m.getP2()) < EPS) return l.getP1();
			return l.getP2();
		}
		double t = a / b;
		double resx = m.getX1() + t * mVec.getX();
		double resy = m.getY1() + t * mVec.getY();
		return new Point2D.Double(resx, resy);
	}
	
	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}
	
	private Point2D sub(Point2D p2, Point2D p1) {
		double x = p2.getX() - p1.getX();
		double y = p2.getY() - p1.getY();
		return new Point2D.Double(x, y);
	}
	
	private Point2D mul(double value, Point2D p) {
		return new Point2D.Double(p.getX() * value, p.getY() * value);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}