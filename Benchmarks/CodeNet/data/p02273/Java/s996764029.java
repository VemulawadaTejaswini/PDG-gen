import java.util.Scanner;

public class Main {
	static class Point {
		double x;
		double y;
		
		public Point(final double x, final double y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return x + " " + y;
		}
		
	}
	
	static void kock(int n, Point p1, Point p2) {
		if (n == 0) {
			return;
		}
		
		double sideX = (p2.x - p1.x) / 3.0;
		double sideY = (p2.y - p1.y) / 3.0; 
		
		Point s = new Point(p1.x + sideX, p1.y + sideY);
		Point t = new Point(p2.x - sideX, p2.y - sideY);
		Point u;
		if (p1.y == p2.y) {
			u = new Point(p1.x + (p2.x - p1.x) / 2.0, p1.y + (p2.x - p1.x) / 6.0 * Math.sqrt(3.0));
		}
		else if (p1.y < p2.y) {
			u = new Point(p1.x, t.y); 
		}
		else {
			u = new Point(p2.x, s.y);
		}
		
		kock(n-1, p1, s);
		System.out.println(s);
		kock(n-1, s, u);
		System.out.println(u);
		kock(n-1, u, t);
		System.out.println(t);
		kock(n-1, t, p2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(100.0, 0.0);
		
		System.out.println(p1);
		kock(n, p1, p2);
		System.out.println(p2);
		
		scan.close();
	}
}