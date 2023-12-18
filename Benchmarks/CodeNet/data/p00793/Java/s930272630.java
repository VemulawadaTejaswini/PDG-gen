import java.awt.geom.*;
import java.util.*;
public class Main {
	double EPS = 1.0e-08;

	//0430 cording
	//0454 cording end
	private void doit() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			if((a|b|c|d|e|f) == 0) break;
			Point2D IC = new Point2D.Double(a, b);
			Point2D PC = new Point2D.Double(c, d);
			Point2D ACM = new Point2D.Double(e, f);
			ArrayList<Point2D> rec = new ArrayList<Point2D>();
			long range = 10000;
			rec.add(new Point2D.Double(0, 0));
			rec.add(new Point2D.Double(range, 0));
			rec.add(new Point2D.Double(range, range));
			rec.add(new Point2D.Double(0, range));
			
			double recS = range * range;
			
			Line2D ICPC = new Line2D.Double(IC, PC);
			Line2D cutLine1 = getLine(ICPC);
			Line2D ICACM = new Line2D.Double(IC, ACM);
			Line2D cutLine2 = getLine(ICACM);
			ArrayList<Point2D> p1 = polygoncut(rec, cutLine1);
			ArrayList<Point2D> p2 = polygoncut(p1, cutLine2);
			
			double area = 0.0;
			for(int i = 0; i < p2.size(); i++){
				Point2D from = p2.get(i), to = p2.get((i+1) % p2.size());
				double temp = cross(from, to) / 2;
				area += temp;
			}
			System.out.printf("%d %.5f\n",++count, area / recS);
		}
	}

	private ArrayList<Point2D> polygoncut(ArrayList<Point2D> p, Line2D l) {
		int len = p.size();
		ArrayList<Point2D> res = new ArrayList<Point2D>();
		for(int i = 0; i < len; i++){
			Point2D from = p.get(i), to = p.get((i+1) % len);
			if(l.relativeCCW(from) <= 0){
				res.add(from);
			}
			int temp1 = l.relativeCCW(from);
			int temp2 = l.relativeCCW(to);
			if(temp1 * temp2 < 0){
				
				Line2D l2 = new Line2D.Double(from, to);
				Point2D intersectP = intersectPtSS(l,l2);
				res.add(intersectP);
			}
		}
		return res;
	}

	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lV = sub(l.getP2(), l.getP1());
		Point2D mV = sub(m.getP2(), m.getP1());
		Point2D m1l1 = sub(m.getP1(), l.getP1());
		double a = cross(m1l1, lV);
		double b = cross(lV, mV);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			return l.getP1();
		}
		double t = a / b;
		double x = m.getX1() + t * (mV.getX());
		double y = m.getY1() + t * (mV.getY());
		return new Point2D.Double(x, y);
	}

	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}

	//垂直二等分線
	private Line2D getLine(Line2D l) {
		Point2D lVec = sub(l.getP2(), l.getP1());
		Point2D midp = new Point2D.Double((l.getX1() + l.getX2()) / 2, (l.getY1() + l.getY2()) / 2);
		Point2D normalV = calcnormalV(lVec);
		long range = 10000;
		double tempx = normalV.getX() * range + midp.getX();
		double tempy = normalV.getY() * range + midp.getY();
//		double tempx = (normalV.getX() + midp.getX()) * range;
//		double tempy = (normalV.getY() + midp.getY()) * range;
		Point2D p1 = new Point2D.Double(tempx, tempy);
		double tempx2 = normalV.getX() * -range + midp.getX();
		double tempy2 = normalV.getY() * -range + midp.getY();
//		tempx = (normalV.getX() + midp.getX()) * -range;
//		tempy = (normalV.getY() + midp.getY()) * -range;
		Point2D p2 = new Point2D.Double(tempx2, tempy2);
		//debug
		double temp3 = (tempx - tempx2) / (tempy - tempy2);
		return new Line2D.Double(p2, p1);
	}

	private Point2D calcnormalV(Point2D p) {
		return new Point2D.Double(-p.getY(), p.getX());
	}

	private Point2D sub(Point2D p2, Point2D p1) {
		double x = p2.getX() - p1.getX();
		double y = p2.getY() - p1.getY();
		return new Point2D.Double(x, y);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}