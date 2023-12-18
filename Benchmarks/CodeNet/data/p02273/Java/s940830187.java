import java.util.*;

class Main {
    public static void main(String[] args) {
	System.out.println(new Point(0, 0).toString());
	koch(new Scanner(System.in).nextInt(),
	     new Point(0, 0),
	     new Point(100, 0));
	System.out.println(new Point(100, 0).toString());
    }

    public static void koch(int d, Point p1, Point p2) {
	if(d == 0) { return; }

	double
	    dx = p2.x - p1.x,
	    dy = p2.y - p1.y;
     	Point
	    s = new Point(p1.x + dx / 3, p1.y + dy / 3),
	    t = new Point(p1.x + dx / 3 * 2, p1.y + dy / 3 * 2);
	double
	    x = t.x - s.x,
	    y = t.y - s.y;
	Point
	    u = new Point(s.x + x / 2 - y / 2 * Math.sqrt(3),
			  s.y + x / 2 * Math.sqrt(3) + y / 2);
	
	koch(d - 1, p1, s);
	System.out.println(s);
	koch(d - 1, s, u);
	System.out.println(u);
	koch(d - 1, u, t);
	System.out.println(t);
	koch(d - 1, t, p2);
    }
}

class Point {
    double x, y;
    public Point(double x, double y){ this.x = x; this.y = y; }
    public String toString(){ return String.format("%.8f %.8f", this.x, this.y); }
}

