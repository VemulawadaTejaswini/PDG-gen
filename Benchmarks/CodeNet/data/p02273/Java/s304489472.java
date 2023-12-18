

import java.util.Scanner;

public class Main {

	static class Point{
		double x;
		double y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString(){
			return x + " " + y;
		}
	}
	
	static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Point start = new Point(0.0, 0.0);
		Point end = new Point(100.0, 0.0);
		System.out.println(start);
		make(start, end, 0);
		System.out.println(end);
		scan.close();
	}
	
	public static void make(Point start, Point end, int i) {
		if (n <= i) {
			return;
		}

		Point s = new Point((2.0 * start.x + 1.0 * end.x) / 3.0, (2.0 * start.y + 1.0 * end.y) / 3.0);
		Point t = new Point((1.0 * start.x + 2.0 * end.x) / 3.0, (1.0 * start.y + 2.0 * end.y) / 3.0);
		
		double ux = (t.x - s.x) * Math.cos(Math.toRadians(60)) - (t.y - s.y)*Math.sin(Math.toRadians(60)) + s.x;
		double uy = (t.x - s.x) * Math.sin(Math.toRadians(60)) + (t.y - s.y)*Math.cos(Math.toRadians(60)) + s.y;
		Point u = new Point(ux, uy);
		
		
		make(start, s, i + 1);
		System.out.println(s);
		make(s, u, i + 1);
		System.out.println(u);
		make(u, t, i + 1);
		System.out.println(t);
		make(t, end, i + 1);
	}

	
	
	
}