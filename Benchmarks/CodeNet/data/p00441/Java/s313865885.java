import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][] = new int[5000][5000];
		Point p[];
		int sum;
		int max;

		n = sc.nextInt();
		while (n != 0) {
			p = new Point[n];
			sum = 0;
			max = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				a[x][y] = 1;
				p[i] = new Point(x, y);
			}
			for (int i = 0; i < 5000; i++) {
				for (int j = 0; j < 5000; j++) {
					a[i][j] = 0;
				}
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int x = p[j].x - p[i].x;
					int y = p[j].y - p[i].y;
					if (0 <= p[i].x - y && p[i].x - y < 5000 && 0 <= p[i].y + x && p[i].y + x < 5000 && a[p[i].x - y][p[i].y + x] == 1) {
						if (0 <= p[j].x - y && p[j].x - y < 5000 && 0 <= p[j].y + x && p[j].y + x < 5000 && a[p[j].x - y][p[j].y + x] == 1) {
							sum = x * x + y * y;
							if (max < sum) {
								max = sum;
							}
						}
					}
					if (0 <= p[i].x + y && p[i].x + y < 5000 && 0 <= p[i].y - x && p[i].y - x < 5000 && a[p[i].x + y][p[i].y - x] == 1) {
						if (0 <= p[j].x + y && p[j].x + y < 5000 && 0 <= p[j].y - x && p[j].y - x < 5000 && a[p[j].x + y][p[j].y - x] == 1) {
							sum = x * x + y * y;
							if (max < sum) {
								max = sum;
							}
						}
					}
				}
			}
			System.out.println(max);

			n = sc.nextInt();
		}
	}
}