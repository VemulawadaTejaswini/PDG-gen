import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Point[] v = new Point[n];
			for (int i = 0; i < n; i++) {
				v[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				sum += ep(v[i], v[i + 1]);
			}
			sum += ep(v[n - 1], v[0]);
			System.out.print(c + " ");
			double ans = Math.abs(1.0 * sum / 2.0);
			System.out.println(ans);
			c++;
		}
	}

	public static int ep(Point a, Point b) {
		return a.x * b.y - a.y * b.x;
	}
}