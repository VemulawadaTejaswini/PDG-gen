import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;
	
	//1755 start
	//1831 sample match
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<Point2D> polygon = new ArrayList<Point2D>();
			for(int i = 0; i < n; i++){
				polygon.add(new Point2D.Double(sc.nextDouble(), sc.nextDouble()));
			}
			Line2D [] lineList = new Line2D[n];
			for(int i = 0; i < n; i++){
				Point2D from = polygon.get(i), to = polygon.get((i+1) % n);
				Line2D nowSegment = new Line2D.Double(from, to);
				lineList[i] = segmentToLine(nowSegment);
			}
			
			boolean ansflg = true;
			for(int i = 0; i < n; i++){
				polygon = polygoncut(polygon, lineList[i]);
				if(polygon.size() < 3){
					ansflg = false;
					break;
				}
			}
			System.out.println(ansflg ? 1:0);
		}

	}
	private ArrayList<Point2D> polygoncut(ArrayList<Point2D> polygon, Line2D l) {
		ArrayList<Point2D> res = new ArrayList<Point2D>();
		int n = polygon.size();
		for(int i = 0; i < n; i++){
			Point2D from = polygon.get(i), to = polygon.get((i+1) % n);
			if(l.relativeCCW(from) <= 0){
				res.add(from);
			}
			
			int temp1 = l.relativeCCW(from);
			int temp2 = l.relativeCCW(to);
			if(temp1 * temp2 < 0){
				Line2D l2 = new Line2D.Double(from, to);
				Point2D intersectpt = intersectPtSS(l,l2);
				res.add(intersectpt);
			}
		}
		
		return res;
	}
	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lV = sub(l.getP2(), l.getP1());
		Point2D mV = sub(m.getP2(), m.getP1());
		Point2D m1l1V = sub(m.getP1(), l.getP1());
		double a = cross(m1l1V, lV);
		double b = cross(lV, mV);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			return l.getP1();
		}
		double t = a / b;
		double x = m.getX1() + t * mV.getX();
		double y = m.getY1() + t * mV.getY();
		return new Point2D.Double(x, y);
	}
	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}
	private Line2D segmentToLine(Line2D l) {
		final int K = 10000;
		Point2D Vec = sub(l.getP2(), l.getP1());
		Point2D p1 = new Point2D.Double(K * Vec.getX() + l.getX1(), K * Vec.getY() + l.getY1());
		Point2D p2 = new Point2D.Double(-K * Vec.getX() + l.getX1(), -K * Vec.getY() + l.getY1());
		return new Line2D.Double(p2, p1);
	}
	private Point2D sub(Point2D p1, Point2D p2) {
		double x = p1.getX() - p2.getX();
		double y = p1.getY() - p2.getY();
		return new Point2D.Double(x, y);
	}
	public static void main(String [] args){
		new Main().doit();
	}
}