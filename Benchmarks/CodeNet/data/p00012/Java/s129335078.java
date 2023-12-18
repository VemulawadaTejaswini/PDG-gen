import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		while ( sc.hasNext() ) {
			Point[] p = new Point[4];
			for(int i=0;i<4;i++) {
				p[i] = new Point( sc.nextDouble(),sc.nextDouble() );
			}
			
			if(!isInner(p[0], p[1], p[2], p[3])) System.out.println("NO");
			else    System.out.println("YES");
			
		}
	}
	
	boolean isInner(Point a, Point b, Point c, Point p) {
		if( (p.sub(a)).mult(b.sub(a)) > 0.0 ) return false;
		if( (p.sub(b)).mult(c.sub(b)) > 0.0 ) return false;
		if( (p.sub(c)).mult(a.sub(c)) > 0.0 ) return false;
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Point {
		double x,y;
		Point (double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		Point sub(Point p) {
			return new Point(x-p.x, y-p.y);
		}
		
		double mult(Point p) {
			return x*p.y-y*p.x;
		}
		
	}
	
}