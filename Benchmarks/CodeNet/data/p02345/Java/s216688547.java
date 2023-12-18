import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		long[] data = new long[n];
		Arrays.fill(data, Integer.MAX_VALUE);
		SegmentTree rmq = new SegmentTree(SegmentTree.QueryType.RMinQ_Update, data);

		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				rmq.update(x, y);
			} else if (cmd == 1) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				pr.println(rmq.query(x, y + 1));
			}
		}
	}

	/**
	 * Segment Tree
	 */
	static class SegmentTree {
		enum QueryType {
			RSumQ_Update,
			RMinQ_Update,
			RMaxQ_Update,
		};

		QueryType qt;

		long INIT; // 要素の単位元
		long[] st; // 要素用SegmentTree
		int n; // 要素数(2のべき乗に補正)

		public SegmentTree(SegmentTree.QueryType qt, long[] data) {
			this.qt = qt;
			
			n = 1;
			while (n < data.length) {
				n *= 2;
			}

			init();

			st = new long[2 * n - 1];
			for (int k = 0, size = data.length; k < n; k++) {
				if (k < size) {
					st[n - 1 + k] = data[k];
				} else {
					st[n - 1 + k] = INIT;
				}
			}
			for (int k = n - 2; k >= 0; k--) {
				long q1 = st[2 * k + 1];
				long q2 = st[2 * k + 2];

				st[k] = f(q1, q2);
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		void update(int i, int x) {
			int k = n - 1 + i;
			st[k] = x;
			while (k > 0) {
				k = (k - 1) / 2;
				long q1 = st[2 * k + 1];
				long q2 = st[2 * k + 2];

				st[k] = f(q1, q2);
			}
		}

		// l,r:0-indexed
		// [l,r)に対するクエリ
		long query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		private long query(int l, int r, int k, int ll, int rr) {
			long ret;

			if (ll >= l && rr <= r) {
				ret = st[k];
			} else if (ll >= r || rr <= l) {
				// 交差なし
				ret = INIT;
			} else {
				int mm = (ll + rr) / 2;

				long q1 = query(l, r, 2 * k + 1, ll, mm);
				long q2 = query(l, r, 2 * k + 2, mm, rr);

				ret = f(q1, q2);
			}

			return ret;
		}

		// 要素の単位元の設定
		private void init() {
			switch (qt) {
			case RSumQ_Update:
				INIT = 0;
				return;
			case RMinQ_Update:
				INIT = Long.MAX_VALUE;
				return;
			case RMaxQ_Update:
				INIT = Long.MIN_VALUE;
				return;
			}

			return;
		}

		// 2つの区間の要素をマージする二項演算
		private long f(long st1, long st2) {
			switch (qt) {
			case RSumQ_Update:
				return st1 + st2;
			case RMinQ_Update:
				return Math.min(st1, st2);
			case RMaxQ_Update:
				return Math.max(st1, st2);
			}

			return 0;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}
		
		int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextInt();
			}
			
			return ret;
		}

		long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextLong();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int m, int n) {
			int[][] ret = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ret[j][i] = sc.nextInt();
				}
			}
			
			return ret;
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
		
		void printInts(int... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printLongs(long... a) {
			StringBuilder sb = new StringBuilder(64);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printStrings(String... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
	}
}

