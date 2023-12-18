import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		Point chart[] = new Point[200];
		Point stars[] = new Point[1000];
		Point cMove = new Point();
		Point sMove = new Point();

		n = scanner.nextInt();
		while (n != 0) {
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				chart[i] = new Point(a, b);
			}
			m = scanner.nextInt();
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				stars[i] = new Point(a, b);
			}
			cMove = translation(n, chart, chart[0]);

			for (int i = 0; i < m; i++) {
				sMove = translation(m, stars, stars[i]);

				if (contains(n, chart, m, stars)) {
					break;
				}

				translation(m, stars, sMove);
			}
			System.out.println((cMove.x - sMove.x) + " " + (cMove.y - sMove.y));
			n = scanner.nextInt();
		}
	}

	public static Point translation(int n, Point p[], Point move) {
		Point a = new Point(move.x, move.y);
		for (int i = 0; i < n; i++) {
			p[i].x -= a.x;
			p[i].y -= a.y;
		}
		a.x *= -1;
		a.y *= -1;
		return a;
	}

	public static boolean contains(int n, Point chart[], int m, Point stars[]) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (chart[i].equals(stars[j])) {
					break;
				}
			}
			if (j == m) {
				return false;
			}
		}
		return true;
	}

	public static void print(int n, Point a[]) {
		for (int i = 0; i < n; i++) {
			System.out.println(a[i].x + ", " + a[i].y);
		}
	}
}