import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	int[] coin;
	int[] use;
	int[] ans;
	int[] m = { 1, 10, 50, 100 };
	int money;
	int min;

	void run() {
		boolean f = false;
		for (;;) {
			money = sc.nextInt();
			if (money == 0) {
				return;
			}
			if (f) {
				System.out.println();
			}
			f = true;
			coin = sc.nextIntArray(4);
			use = new int[4];
			ans = new int[4];
			min = Integer.MAX_VALUE;
			dfs(0, 0);
			for (int i = 0; i < 4; i++) {
				if (ans[i] != 0) {
					System.out.println(m[i] + " " + ans[i]);
				}
			}
		}
	}

	void dfs(int index, int sum) {
		if (index == 4) {
			int res = use[0] * 10 + use[1] * 50 + use[2] * 100 + use[3] * 500;
			if (res >= money) {
				int sub = res - money;
				int cnt = 0;
				for (int i = 3; i >= 0; i--) {
					int cc = sub / m[i];
					if (cc != 0) {
						sub -= m[i] * cc;
						cnt += cc;
					}
				}
				if (min > cnt) {
					min = cnt;
					for (int i = 0; i < 4; i++) {
						ans[i] = use[i];
					}
				}
			}
			return;
		}
		for (int i = 0; i <= coin[index]; i++) {
			use[index] = i;
			dfs(index + 1, sum + m[index] * i);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int lim) {
		return 0 <= h && h < lim && 0 <= w && w < lim;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(int a[], int border) {
		int l = -1;
		int r = a.length;

		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border <= a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}
	}
}