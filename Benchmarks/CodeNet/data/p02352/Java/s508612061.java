import java.io.*;
import java.util.NoSuchElementException;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		RMQ_RAQ rmq = new RMQ_RAQ(new int[n]);

		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int x = sc.nextInt();

				rmq.add(s, t + 1, x);
			} else if (cmd == 1) {
				int s = sc.nextInt();
				int t = sc.nextInt();

				pr.println(rmq.query(s, t + 1));
				pr.flush();
			}
		}
	}

	// RMQ and RAQ by Segment Tree
	static class RMQ_RAQ {
		long[] stAdd;
		// セグメント内のすべてに足す値
		long[] stMin;
		// セグメント内の最小値
		int n; // dataの要素数(2のべき乗に補正)

		final static int INF = Integer.MAX_VALUE;

		public RMQ_RAQ(int[] data) {
			n = 1;
			while (n < data.length) {
				n *= 2;
			}

			stAdd = new long[2 * n - 1];

			stMin = new long[2 * n - 1];
			for (int i = 0, size = data.length; i < size; i++) {
				stMin[n - 1 + i] = data[i];
			}
			for (int i = data.length; i < n; i++) {
				stMin[n - 1 + i] = INF;
			}
			for (int i = n - 2; i >= 0; i--) {
				stMin[i] = Math.min(stMin[2 * i + 1], stMin[2 * i + 2]);
			}
		}

		// l,r:0-indexed
		// [l,r)の値にadd
		void add(int l, int r, long x) {
			add(l, r, x, 0, 0, n);
		}

		void add(int l, int r, long x, int k, int ll, int rr) {
			if (ll >= l && rr <= r) {
				stAdd[k] += x;
				stMin[k] += x;
				while (k > 0) {
					k = (k - 1) / 2;
					stMin[k] = Math.min(stMin[2 * k + 1], stMin[2 * k + 2]);
					stMin[k] += stAdd[k];
				}
			} else if (ll >= r || rr <= l) {
				// 交差なし
			} else {
				int mm = (ll + rr) / 2;
				add(l, r, x, 2 * k + 1, ll, mm);
				add(l, r, x, 2 * k + 2, mm, rr);
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		long query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		long query(int l, int r, int k, int ll, int rr) {
			long ret;

			if (ll >= l && rr <= r) {
				ret = stMin[k];
			} else if (ll >= r || rr <= l) {
				// 交差なし
				ret = INF;
			} else {
				int mm = (ll + rr) / 2;
				stAdd[2 * k + 1] += stAdd[k];
				stAdd[2 * k + 2] += stAdd[k];
				stMin[2 * k + 1] += stAdd[k];
				stMin[2 * k + 2] += stAdd[k];
				stAdd[k] = 0;
				ret = Math.min(query(l, r, 2 * k + 1, ll, mm), query(l, r, 2 * k + 2, mm, rr));
			}

			return ret;
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

