import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum;
		int max;
		Point p[];

		n = sc.nextInt();
		while (n != 0) {
			p = new Point[n];
			max = 0;
			sum = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				p[i] = new Point(x, y);
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					sum = f(p, n, i, j);
					if (max < sum) {
						max = sum;
					}
				}
			}
			System.out.println(max);

			n = sc.nextInt();
		}
	}

	public static int f(Point p[], int n, int a, int b) {
		int x = p[b].x - p[a].x;
		int y = p[b].y - p[a].y;
		boolean flag1 = false;
		boolean flag2 = false;

		for (int i = 0; i < n && i != a && i != b && !flag1; i++) {
			if (p[i].equals(new Point(p[b].x - y, p[b].y + x))) {
				flag1 = true;
			}
		}
		for (int i = 0; i < n && i != a && i != b && !flag2; i++) {
			if (p[i].equals(new Point(p[a].x - y, p[a].y + x))) {
				flag2 = true;
			}
		}
		if (flag1 && flag2) {
			return x * x + y * y;
		}

		flag1 = false;
		flag2 = false;
		for (int i = 0; i < n && i != a && i != b && !flag1; i++) {
			if (p[i].equals(new Point(p[b].x + y, p[b].y - x))) {
				flag1 = true;
			}
		}
		for (int i = 0; i < n && i != a && i != b && !flag2; i++) {
			if (p[i].equals(new Point(p[a].x + y, p[a].y - x))) {
				flag2 = true;
			}
		}
		if (flag1 && flag2) {
			return x * x + y * y;
		}
		return 0;
	}
}