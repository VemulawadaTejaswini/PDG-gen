import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			double x1 = Double.parseDouble(s[0]);
			double y1 = Double.parseDouble(s[1]);
			double x2 = Double.parseDouble(s[2]);
			double y2 = Double.parseDouble(s[3]);
			double xq = Double.parseDouble(s[4]);
			double yq = Double.parseDouble(s[5]);
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Point q = new Point(xq, yq);
			double k = dot(vec(p1, p2), vec(p1, q)) / dot(vec(p1, p2), vec(p1, p2));
			double x = 2 * (p1.x + k * vec(p1, p2).x) - xq;
			double y = 2 * (p1.y + k * vec(p1, p2).y) - yq;
			System.out.printf("%f %f\n", x, y);
		}
		sc.close();
	}
	static class Point{
		double x, y;
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	static Point vec(Point p1, Point p2) {
		return new Point(p2.x - p1.x, p2.y - p1.y);
	}
	static double dot(Point p1, Point p2) {
		return p1.x * p2.x + p1.y * p2.y;
	}
	static double norm(Point p1) {
		return Math.sqrt(p1.x * p1.x + p1.y * p1.y);
	}
}
