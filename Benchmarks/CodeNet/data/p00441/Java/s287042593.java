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
			quickSort(p, 0, n - 1);

			for (int i = 0; i < n - 1; i++) {
				for (int j = n - 1; 0 <= j; j--) {
					int a = (p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y);
					if (max < a) {
						sum = f(p, n, i, j);
						if (max < sum) {
							max = sum;
						}
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

	public static void quickSort(Point p[], int low, int high) {
		if (high <= low) {
			return ;
		}
		int i = low;
		int j = high;
		int x = p[(low + high) / 2].x;
		while (i <= j) {
			while (p[i].x < x) {
				i++;
			}
			while (x < p[j].x) {
				j--;
			}
			if (i <= j) {
				Point swap = p[i];
				p[i] = p[j];
				p[j] = swap;
				i++;
				j--;
			}
		}
		quickSort(p, low, j);
		quickSort(p, i, high);
	}
}