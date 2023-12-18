import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int w, l;
		int n;
		int x1, x2, y1, y2;
		int count;

		w = scanner.nextInt();
		l = scanner.nextInt();
		while (w + l != 0) {
			n = scanner.nextInt();
			count = 0;
			int a[][] = new int[l][w];
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = 0;
				}
			}

			for (int i = 0; i < n; i++) {
				x1 = scanner.nextInt();
				y1 = scanner.nextInt();
				x2 = scanner.nextInt();
				y2 = scanner.nextInt();
				for (int j = y1; j < y2; j++) {
					for (int k = x1; k < x2; k++) {
						a[j][k] = -1;
					}
				}
			}

			for (int i = 0; i < l; i++) {
				for (int j = 0; j < w; j++) {
					if (a[i][j] == 0) {
						f(a, w, l, j, i);
						count++;
					}
				}
			}
			System.out.println(count);
			w = scanner.nextInt();
			l = scanner.nextInt();
		}
	}
	public static void f(int a[][], int w, int l, int x, int y) {
		a[y][x] = 1;
		if (0 < x) {
			if (a[y][x - 1] == 0) {
				f(a, w, l, x - 1, y);
			}
		}
		if (x < w - 1) {
			if (a[y][x + 1] == 0) {
				f(a, w, l, x + 1, y);
			}
		}
		if (0 < y) {
			if (a[y - 1][x] == 0) {
				f(a, w, l, x, y - 1);
			}
		}
		if (y < l - 1) { 
			if (a[y + 1][x] == 0) {
				f(a, w, l, x, y + 1);
			}
		}
		return ;
	}
}