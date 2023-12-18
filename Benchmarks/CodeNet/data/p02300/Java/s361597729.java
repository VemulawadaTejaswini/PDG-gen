import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Polygon p = new Polygon();
		for (int i=0;i<n;i++) {
			p.add(new Point(in.nextInt(), in.nextInt()));
		}
		Polygon ch = convexHull(p);
		
		Point lowest=new Point(Double.MAX_VALUE, Double.MAX_VALUE);
		int lowesti=-1;
		for (int i=0;i<ch.size();i++) {
			if (lowest.y>ch.get(i).y || (lowest.y==ch.get(i).y&&lowest.x>ch.get(i).x)) {
				lowest = ch.get(i);
				lowesti = i;
			}
		}
		System.out.println(ch.size()-1);
		for (int i=lowesti;i<ch.size()-1;i++) {
			System.out.println((int)ch.get(i).x+" "+(int)ch.get(i).y);
		}
		for (int i=0;i<lowesti;i++) {
			System.out.println((int)ch.get(i).x+" "+(int)ch.get(i).y);
		}
	}

	static Polygon convexHull(Polygon s) {
		if (s.size()<3) return s;
		Point[] arP = s.toArray(new Point[0]);
		Arrays.sort(arP, new Comparator<Point>() {
			public int compare(Point p0, Point p1) {
				return p0.x==p1.x ? (p0.y<p1.y?-1:p0.y>p1.y?1:0) : p0.x < p1.x ? -1:1;
			}
		});
		
		Polygon high = new Polygon();
		Polygon low  = new Polygon();
		
		high.add(arP[0]);high.add(arP[1]);
		for (int i=2;i<arP.length;i++) {
			int cur=high.size()-1;
			while (high.size()>=2 && ccw(arP[i], high.get(cur-1), high.get(cur))==-1) {
				high.remove(cur);
				cur--;
			}
			high.add(arP[i]);
		}
		
		low.add(arP[arP.length-1]);
		low.add(arP[arP.length-2]);
		for (int i=arP.length-3;i>=0;i--) {
			int cur = low.size()-1;
			while (low.size()>=2 && ccw(arP[i], low.get(cur-1), low.get(cur))==-1) {
				low.remove(cur);
				cur--;
			}
			low.add(arP[i]);
		}
		
//		// clockwise
//		for (int i=0;i<low.size()-1;i++) {
//			high.add(low.get(i));
//		}
//		return high;

		// counter-clockwise
		Polygon res = new Polygon();
		for (int i=low.size()-1;i>=0;i--) {
			res.add(low.get(i));
		}
		for (int i=high.size()-2;i>=0;i--) {
			res.add(high.get(i));
		}
		return res;
	}
	static int ccw(Point lp0, Point lp1, Point p) {
		Vector lv = lp1.diff(lp0);
		Vector pv = p.diff(lp0);
		double cp=0.0;
		if ((cp=lv.crossProduct(pv))>EPS) {return -1;} // counter-clockwise
		if (cp<-EPS) {return 1;} // clockwise
		if (lv.dotProduct(pv)<-EPS) return 2; // online-back
		if (lv.norm() < pv.norm()) return 3; // online-front
		return 0; // on-segment
	}
	static double EPS = 0.0000000001;

}
class Point {
	static double EPS = 0.0000000001;
	double x; double y;
	public Point(double ax, double ay){x=ax;y=ay;}
	public Vector sum(Point p) { return new Vector(x+p.x,y+p.y); }
	public Vector diff(Point p) { return new Vector(x-p.x,y-p.y); }
	public Vector mult(double k) { return new Vector(x*k,y*k); }
	public Vector div(double k) { return new Vector(x*(1.0/k),y*(1.0/k)); }
	public boolean equals(Point p){return Math.abs(x-p.x)<EPS && Math.abs(y-p.y)<EPS;}
	public String toString(){return "("+x+","+y+")";}
}
class Vector extends Point {
	public Vector(double ax, double ay) {super(ax,ay);}
	public Vector(Point p1, Point p2) {super(p1.x-p2.x,p2.x-p2.y);}
	public double norm() {return x*x+y*y;}
	public double abs() {return Math.sqrt(norm());}
	// TODO:
	public boolean isSmallerThan(Vector v) {return x!=v.x?x<v.x:y<v.y;}
	public double dotProduct(Vector v) {return x*v.x+y*v.y;}
	public double crossProduct(Vector v) {return x*v.y - y*v.x;}
}
class Polygon extends ArrayList<Point>{}