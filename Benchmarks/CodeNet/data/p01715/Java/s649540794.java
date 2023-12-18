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

		solve(n, m, w);
	}

	void solve(int n, int m, int[] w) {
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
			// j is fixed.
			// Attention: h[i][k]:=f[k][j-1]+w[i-1]*(i-k) is of Monge.
			// min(h[i][]) can be enumerated in O(n*log(n))
			// f[i][j]=min(h[i][])
			long[] v = calc(f, w, j);
			for (int i = 1; i <= n; ++i) {
				// for (int k = 1; k <= i - 1; ++k) {
				// f[i][j] = Math.min(f[i][j], h(f, w, i, j, k));
				// }
				f[i][j] = v[i];
			}
		}

		long min = Integer.MAX_VALUE / 16;
		for (int j = 1; j <= m; ++j) {
			min = Math.min(min, f[n][j]);
		}
		ans += min;
		System.out.println(ans);
	}

	long[] calc(long[][] f, int[] w, int j) {
		int n = f.length - 1;
		int m = f[0].length - 1;
		long[] ret = new long[n + 1];
		Arrays.fill(ret, Integer.MAX_VALUE / 16);
		rec(ret, 1, n, 2, n + 1, f, w, j);
		return ret;
	}

	// [low,high]
	// [left,right)
	long rec(long[] ret, int low, int high, int left, int right, long[][] f, int[] w, int j) {
		int mid = (left + right) / 2;// the value of the variable i
		long v = Long.MAX_VALUE / 16;
		int arg = -1;
		for (int k = Math.max(0, low); k <= Math.min(mid - 1, high); ++k) {
			v = Math.min(v, h(f, w, mid, j, k));
			if (v == h(f, w, mid, j, k))
				arg = k;
		}
		if (right - left > 1) {
			rec(ret, low, arg, left, mid, f, w, j);
			rec(ret, arg, high, mid, right, f, w, j);
		}
		ret[mid] = v;
		return v;
	}

	long h(long[][] f, int[] w, int i, int j, int k) {
		return f[k][j - 1] + w[i - 1] * (i - k);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}