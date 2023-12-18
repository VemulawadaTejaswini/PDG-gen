

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m, t, p, d, c, x, y;
		Scanner s = new Scanner(System.in);

		while (true) {
			n = s.nextInt();
			m = s.nextInt();
			t = s.nextInt();
			p = s.nextInt();
			int[][] a = new int[m][n];
			int[][] b = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = 1;
					b[i][j] = 1;
				}
			}

			if (n == 0 && m == 0 && t == 0 && p == 0) {
				break;
			}
			//
			for (int i = 0; i < t; i++) {
				d = s.nextInt();
				c = s.nextInt();

				for (int j = 0; j < m; j++) {
					for (int k = 0; k < n; k++) {
						b[j][k] = a[j][k];
					}
				}

				if (d == 1) {
					if (c * 2 <= n) {
						//
						for (int j = 0; j < m; j++) {
							int w = 0;
							for (int k = 0; k < c; k++) {
								a[j][k] = b[j][c + w] + b[j][c - 1 - w];
								w++;
							}
							for (int k = c; k < n - c; k++) {
								a[j][k] = b[j][c + w];
								w++;
							}
						}
						n -= c;
					} else {
						//
						for (int j = 0; j < m; j++) {
							int w = 0;
							for (int k = 0; k < n - c; k++) {
								a[j][k] = b[j][c + w] + b[j][c - 1 - w];
								w++;
							}
							//
							for (int k = n - c; k < c; k++) {
								a[j][k] = b[j][c - 1 - w];
								w++;
							}
						}
						n = c;
					}
				}
				if (d == 2) {
					if (c * 2 <= m) {
						for (int j = 0; j < n; j++) {
							int w = 0;
							for (int k = 0; k < c; k++) {
								a[k][j] = b[c + w][j] + b[c - 1 - w][j];
								w++;
							}
							for (int k = c; k < m - c; k++) {
								a[k][j] = b[c + w][j];
								w++;
							}
						}
						m -= c;
					} else {

						for (int j = 0; j < n; j++) {
							int w = 0;
							for (int k = 0; k < m - c; k++) {
								a[k][j] = b[c + w][j] + b[c - 1 - w][j];
								w++;
							}

							for (int k = m - c; k < c; k++) {
								a[k][j] = b[c - 1 - w][j];
								w++;
							}
						}
						m = c;
					}
				}
			}
			for (int j = 0; j < p; j++) {
				x = s.nextInt();
				y = s.nextInt();
				System.out.println(a[y][x]);
			}
		}
		s.close();
	}
}

