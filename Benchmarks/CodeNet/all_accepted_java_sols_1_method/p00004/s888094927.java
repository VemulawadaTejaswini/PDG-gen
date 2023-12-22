import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, f;

		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			double x;
			double y;
			int a2 = a * e;
			int b2 = b * e;
			int c2 = c * e;
			int d2 = d * b;
			int e2 = e * b;
			int f2 = f * b;
			a2 = a2 - d2;
			c2 = c2 - f2;
			x = c2 * 1.0 / a2;
			if (x == 0.0) {
				x = 0.0;
			}

			a2 = a * d;
			b2 = b * d;
			c2 = c * d;
			d2 = d * a;
			e2 = e * a;
			f2 = f * a;
			b2 = b2 - e2;
			c2 = c2 - f2;
			y = c2 * 1.0 / b2;
			if (y == 0.0) {
				y = 0.0;
			}

			System.out.printf("%1.3f %1.3f\n", x, y);
		}
	}
}