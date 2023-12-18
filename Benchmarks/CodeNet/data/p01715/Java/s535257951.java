import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long MODULO = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] t = new int[n];
		int[] p = new int[n];
		int[] x = new int[s];
		for (int i = 0; i < s; ++i) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			--p[i];
		}
		int[] w = new int[n];
		for (int i = 0; i < n; ++i) {
			w[i] = t[i] - x[p[i]];
		}
		Arrays.sort(w);
		long ans = 0;
		for (long v : w) {
			ans -= v;
		}
		long[][] f = new long[n + 1][m + 1];
		for (int i = 0; i < f.length; ++i) {
			for (int j = 0; j < f[i].length; ++j) {
				f[i][j] = Integer.MAX_VALUE / 16;
			}
		}
		for (int i = 1; i < f.length; ++i) {
			f[i][1] = w[i - 1] * i;
		}

		for (int j = 2; j <= m; ++j) {
			for (int i = 1; i <= n; ++i) {
				for (int k = 1; k <= i - 1; ++k) {
					f[i][j] = Math.min(f[i][j], f[k][j - 1] + w[i - 1] * (i - k));
				}
			}
		}

		long min = Integer.MAX_VALUE / 16;
		for (int j = 1; j <= m; ++j) {
			min = Math.min(min, f[n][j]);
		}
		ans += min;
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}