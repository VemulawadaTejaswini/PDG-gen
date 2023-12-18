import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.-]+");

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			Point p1 = Point.input(scan);
			Point p2 = Point.input(scan);
			Point p3 = Point.input(scan);

			double A = p2.d2(p3);
			double B = p3.d2(p1);
			double C = p1.d2(p2);

			Point cc = p1.mul(A * (B + C - A)).add(p2.mul(B * (C + A - B))).add(p3.mul(C * (A + B - C)))
					.mul(1 / (A * (B + C - A) + B * (C + A - B) + C * (A + B - C)));

			System.out.println(cc.toString() + " " + String.format("%.3f", Math.sqrt(cc.d2(p1))));
		}

	}

	static class Point {
		final double x;
		final double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public Point mul(double d) {
			return new Point(d * x, d * y);
		}

		public Point add(Point p) {
			return new Point(x + p.x, y + p.y);
		}

		public double d2(Point p) {
			return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y);
		}

		public String toString() {
			return String.format("%.3f %.3f", x, y);
		}

		public static Point input(Scanner scan) {
			return new Point(scan.nextDouble(), scan.nextDouble());
		}
	}
}