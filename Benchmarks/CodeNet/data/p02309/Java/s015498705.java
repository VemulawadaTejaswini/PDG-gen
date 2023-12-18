
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static double arg(Point p) {return Math.atan2(p.y, p.x);}
	static Point polar(double r, double a){return new Point(r*Math.cos(a),r*Math.sin(a));}
	static Point[] getCrossPoints(Circle c1, Circle c2) {
		double d = c1.c.diff(c2.c).abs();
		double a = Math.acos((c1.r*c1.r+d*d-c2.r*c2.r)/(2*c1.r*d));
		double t = arg(c2.c.diff(c1.c));
		return new Point[]{c1.c.sum(polar(c1.r,t+a)), c1.c.sum(polar(c1.r,t-a))};
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle(new Point(scan.nextInt(),scan.nextInt()),scan.nextInt());
		Circle c2 = new Circle(new Point(scan.nextInt(),scan.nextInt()),scan.nextInt());
		Point[] arP = getCrossPoints(c1,c2);
		System.out.println(arP[1].x+" "+arP[1].y+" "+arP[0].x+" "+arP[0].y);
	}

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

class Segment {
	Point p1; Point p2;
	public Segment(Point ap1, Point ap2){p1=ap1;p2=ap2;}
	public double dotProduct(Segment s) {return (p1.x-p2.x)*(s.p1.x-s.p2.x)+(p1.y-p2.y)*(s.p1.y-s.p2.y);}
	public double crossProduct(Segment s) {return (p1.x-p2.x)*(s.p1.y-s.p2.y) - (p1.y-p2.y)*(s.p1.x-s.p2.x);}
	public String toString(){return p1.toString()+"->"+p2.toString();}
	public Line toLine() {return new Line(p1,p2);}
}
class Line extends Segment{public Line(Point ap1, Point ap2){super(ap1,ap2);}}

class Circle {Point c;double r;Circle(Point ac, double ar){c=ac;r=ar;}public String toString(){return "c:"+c.toString()+",r:"+r;}}
class Polygon extends ArrayList<Point>{}