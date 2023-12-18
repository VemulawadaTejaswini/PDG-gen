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
		
		Point s = new Point(p1.x + (p2.x - p1.x) / 3.0, p1.y);
		Point u = new Point((p2.x - p1.x) / 2.0, (p2.x - p1.x) / 6.0 * Math.sqrt(3.0));
		Point t = new Point(p2.x - (p2.x - p1.x) / 3.0, p1.y);
		
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