import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	int n;
	Item[] item;
	int[] ans;
	double G;

	void run() {
		for (;;) {
			n = sc.nextInt();
			if (n == 0)
				return;
			item = new Item[n];
			ans = new int[n];
			perm = new int[n];
			used = new boolean[n];
			G = Double.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				item[i] = new Item(sc.next(), sc.nextInt(), sc.nextInt());
			}

			permutation(0);
			for (int i = n - 1; i >= 0; i--) {
				System.out.println(item[ans[i]].name);
			}
		}
	}

	// make permutation (N<=11)
	boolean[] used;
	int[] perm;

	void permutation(int pos) {
		if (pos == n) {

			int W = 0;
			double tmp = 0;
			for (int i = 0; i < n; i++) {
				if (item[perm[i]].s < W) return;
				W += item[perm[i]].w;
				tmp += item[perm[i]].w * (n - i);
			}
			if (tmp / W < G) {
				G = tmp / W;
				for (int i = 0; i < n; i++) {
					ans[i] = perm[i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				perm[pos] = i;
				used[i] = true;
				permutation(pos + 1);
				used[i] = false;
			}
		}
	}

	class Item {
		String name;
		int w;
		int s;

		/**
		 * @param name
		 * @param w
		 * @param s
		 */
		public Item(String name, int w, int s) {
			super();
			this.name = name;
			this.w = w;
			this.s = s;
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
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

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
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

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}