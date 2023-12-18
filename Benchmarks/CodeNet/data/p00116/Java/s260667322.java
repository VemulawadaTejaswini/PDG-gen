import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		for (;;) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if ((H | W) == 0)
				return;
			int[][] f = new int[H][W + 1];
			for (int i = 0; i < H; i++) {
				String row = sc.next();
				for (int j = 0; j < W; j++) {
					if (i == 0)
						f[i][j] = (row.charAt(j) == '.') ? 1 : 0;
					else
						f[i][j] = (row.charAt(j) == '.') ? f[i - 1][j] + 1 : 0;
				}
			}
			long area = 0;

			for (int h = 0; h < H; h++) {
				Stack<Rect> st = new Stack<Rect>();
				for (int i = 0; i < f[h].length; i++) {
					if (st.isEmpty() || st.peek().height < f[h][i])
						st.push(new Rect(i, f[h][i]));
					else if (st.peek().height > f[h][i]) {
						int lastPos = 0;
						while (!st.isEmpty() && st.peek().height > f[h][i]) {
							Rect use = st.pop();
							area = Math.max(area, (i - use.pos) * use.height);
							lastPos = use.pos;
						}
						st.push(new Rect(lastPos, f[h][i]));
					}
				}
			}
			System.out.println(area);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Rect {
		int pos;
		long height;

		public Rect(int pos, long height) {
			super();
			this.pos = pos;
			this.height = height;
		}
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