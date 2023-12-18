import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] p = new int[n];
			for (int i = 0; i < n; ++i)
				p[i] = sc.nextInt();

			int[][] f = new int[n + 1][5000 * n + 1];
			for (int i = 0; i < f.length; ++i) {
				for (int j = 0; j < f[i].length; ++j) {
					f[i][j] = -Integer.MAX_VALUE / 3;
				}
			}
			f[0][0] = 0;
			// f[i][j]=500円i枚、消費j円の時の硬貨は最大何円あるか
			for (int i = 0; i < n; ++i) {
				for (int j = n - 1; j >= 0; --j) {
					for (int k = f[i].length - p[i] - 1; k >= 0; --k) {
						if (f[j][k] < 0)
							continue;
						if (p[i] % 1000 > 0 && p[i] % 1000 <= 500) {
							f[j + 1][k + p[i]] = Math.max(f[j + 1][k + p[i]], f[j][k] + (1000 - p[i] % 1000) % 500);
						} else {
							f[j][k + p[i]] = Math.max(f[j][k + p[i]], f[j][k] + (1000 - p[i]) % 1000);
							if (f[j][k] >= p[i] % 1000 - 500 + (p[i] % 1000 == 0 ? 1000 : 0)) {
								f[j + 1][k + p[i]] = Math.max(f[j + 1][k + p[i]], f[j][k] - (p[i] % 1000 - 500));
							}
						}
					}
				}
			}
			int c = 0, s = 0;
			for (int i = 1; i <= n; ++i) {
				for (int j = 0; j < f[i].length; ++j) {
					if (f[i][j] < 0)
						continue;
					c = i;
					s = j;
					break;
				}
			}
			System.out.println(c + " " + s);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
