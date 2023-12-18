

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static double EPS = 0.0000000001;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int g = scan.nextInt();
		Polygon pol = new Polygon();
		for (int i=0;i<g;i++) {
			pol.add(new Point(scan.nextInt(),scan.nextInt()));
		}
		int q = scan.nextInt();
		for (int i=0;i<q;i++) {
			System.out.println(contains(pol, new Point(scan.nextInt(),scan.nextInt())));
		}
	}
	static int contains(Polygon poly, Point p) {
		int nCross=0;
		for (int i=0;i<poly.size();i++) {
			Vector a = poly.get(i).diff(p); 
			Vector b = poly.get((i+1)%poly.size()).diff(p); 
			if (Math.abs(a.crossProduct(b))<EPS && a.dotProduct(b)<EPS) return 1;// 1:on
			if (a.y>b.y){Vector tmp=a;a=b;b=tmp;}
			if (a.y<EPS && b.y>EPS && a.crossProduct(b)>EPS) nCross++;
		}
		return nCross%2==1 ? 2 : 0;// 2:in, 0:out
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