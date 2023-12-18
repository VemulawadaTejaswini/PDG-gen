import java.util.Scanner;

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

public class Main {
	static double EPS = 0.0000000001;
	public static void main(){
		Scanner scan = new Scanner(System.in);
		
		Point p0 = new Point(scan.nextInt(), scan.nextInt());
		Point p1 = new Point(scan.nextInt(), scan.nextInt());
		int p = scan.nextInt();
		for (int i=0;i<p;i++) {
			Point p2 = new Point(scan.nextInt(), scan.nextInt());
			int res=ccw(p0,p1,p2);
			if (res==1) System.out.println("COUNTER_CLOCKWISE");
			if (res==2) System.out.println("CLOCKWISE");
			if (res==3) System.out.println("ONLINE_BACK");
			if (res==5) System.out.println("ON_SEGMENT");
			if (res==4) System.out.println("ONLINE_FRONT");
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

}