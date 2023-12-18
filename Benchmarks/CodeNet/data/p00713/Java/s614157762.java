import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static double EPS = 1e-6;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			Circle[] c = new Circle[n];
			LinkedList<Point> p = new LinkedList<Point>();
			for(int i=0; i<n; i++){
				c[i] = new Circle(in.nextDouble(), in.nextDouble(), 1);
				for(int j=i-1; j>=0; j--){
					Point[] pos = c[i].crossPoint(c[j]);
					if(pos == null) continue;
					p.add(pos[0]);
					p.add(pos[1]);
				}
			}
			int res = 1;
			for(Point pos: p){
				int count = 0;
				for(int i=0; i<n; i++){
					if(pos.dist2(c[i].p) <= 1+EPS) count++;
				}
				res = Math.max(res, count);
			}
			System.out.println(res);
		}
	}
}

class Circle{
	final static double EPS = 1e-6;
	
	Point p;
	double r;
	public Circle(double x, double y, double r){
		p = new Point(x, y);
		this.r = r;
	}
	
	public Point[] crossPoint(Circle c){
		if(!cross(c)) return null;
		double x1 = c.p.x - p.x;
		double y1 = c.p.y - p.y;
		double a = (x1*x1+y1*y1+r*r-c.r*c.r)/2.0;
		Point[] res = {
				new Point(culc(x1, y1, r, a, true)+p.x, culc(y1, x1, r, a, false)+p.y),
				new Point(culc(x1, y1, r, a, false)+p.x, culc(y1, x1, r, a, true)+p.y),
		};
		return res;
	}
	
	private static double culc(double x, double y, double r, double a, boolean sign){
		return (a*x + (sign?1:-1)*y*Math.sqrt((x*x+y*y)*r*r-a*a)+EPS)/(x*x+y*y);
	}
	
	public boolean cross(Circle c){
		return p.dist2(c.p) <= (r+c.r)*(r+c.r) + EPS;
	}
}

class Point{
	double x, y;
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double dist2(Point p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
}