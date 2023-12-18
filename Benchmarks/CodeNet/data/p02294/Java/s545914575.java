import java.util.Scanner;


public class Main {
	static double EPS = 0.0000000001;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int i=0;i<q;i++) {
			if (intersect(new Point(s.nextInt(),s.nextInt()), new Point(s.nextInt(),s.nextInt()), new Point(s.nextInt(),s.nextInt()), new Point(s.nextInt(),s.nextInt()) )) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
	static int ccw(Point lp0, Point lp1, Point p) {
		Vector lv = lp1.diff(lp0);
		Vector pv = p.diff(lp0);
		double cp=0.0;
		if ((cp=lv.crossProduct(pv))>EPS) {return 1;} // counter-clockwise
		if (cp<-EPS) {return 2;} // clockwise
		if (lv.dotProduct(pv)<-EPS) return 3; // online-back
		if (lv.norm() < pv.norm()) return 4; // online-front
		return 5; // on-segment
	}
	static boolean intersect(Point p0, Point p1, Point p2, Point p3) {return ccw(p0,p1,p2)*ccw(p0,p1,p3)==2 && ccw(p2,p3,p0)*ccw(p2,p3,p1)==2;}
	static boolean intersect(Segment s1, Segment s2){return intersect(s1.p1,s1.p2,s2.p1,s2.p2);}

}
class Point {
	double x; double y;
	public Point(double ax, double ay){x=ax;y=ay;}
	public Vector sum(Point p) { return new Vector(x+p.x,y+p.y); }
	public Vector diff(Point p) { return new Vector(x-p.x,y-p.y); }
	public Vector mult(double k) { return new Vector(x*k,y*k); }
	public Vector div(double k) { return new Vector(x*(1.0/k),y*(1.0/k)); }
	static double EPS = 0.0000000001;
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

class Segment {
	Point p1; Point p2;
	public Segment(Point ap1, Point ap2){p1=ap1;p2=ap2;}
	public double dotProduct(Segment s) {return (p1.x-p2.x)*(s.p1.x-s.p2.x)+(p1.y-p2.y)*(s.p1.y-s.p2.y);}
	public double crossProduct(Segment s) {return (p1.x-p2.x)*(s.p1.y-s.p2.y) - (p1.y-p2.y)*(s.p1.x-s.p2.x);}
	public String toString(){return p1.toString()+"->"+p2.toString();}
}