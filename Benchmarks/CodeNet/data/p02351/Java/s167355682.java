import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int[] data = new int[n];
		RSQ_RAQ_SqrtDecomposition ruq = new RSQ_RAQ_SqrtDecomposition(data);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;
				int x = sc.nextInt();

				ruq.add(s, t + 1, x);
			} else if (cmd == 1) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;

				pr.println(ruq.getSum(s, t + 1));
				pr.flush();
			}
		}
	}

	private static class RSQ_RAQ_SqrtDecomposition {
		int[] data;
		// bakets???????????????????¶???????
		int[] bakets;
		// bakets??????????¨????(??????????¨?????????????????¶???????)
		long[] sb;
		int n; // data???????´???°
		int d; // 1??????bakets?????§??????
		int m; // bakets?????°

		public RSQ_RAQ_SqrtDecomposition(int[] data) {
			this.n = data.length;
			this.data = data;
			this.d = (int)Math.sqrt(n);

			this.m = (n + d - 1) / d;
			bakets = new int[m];
			Arrays.fill(bakets, 0);
			sb = new long[m];
		}

		// l,r:0-indexed
		// [l,r)?????????add
		void add(int l, int r, int x) {
			int bl = l / d;
			int br = (r - 1) / d;
			for (int i = bl; i <= br; i++) {
				int tmpl = i * d;
				int tmpr = Math.min((i + 1) * d, n);
				if (tmpl >= l && tmpr <= r) {
					bakets[i] += x;
				} else {
					tmpl = Math.max(tmpl, l);
					tmpr = Math.min(tmpr, r);
					for (int j = tmpl; j < tmpr; j++) {
						data[j] += x;
						sb[i] += x;
					}
				}
			}
		}

		// l,r:0-indexed
		// [l,r)??????
		long getSum(int l, int r) {
			int bl = l / d;
			int br = (r - 1) / d;
			long ret = 0;
			for (int i = bl; i <= br; i++) {
				int tmpl = i * d;
				int tmpr = Math.min((i + 1) * d, n);
				if (tmpl >= l && tmpr <= r) {
					ret += (long)(tmpr - tmpl) * bakets[i];
					ret += sb[i];
				} else {
					tmpl = Math.max(tmpl, l);
					tmpr = Math.min(tmpr, r);
					for (int j = tmpl; j < tmpr; j++) {
						ret += data[j];
						ret += bakets[i];
					}
				}
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

	@SuppressWarnings("unused")
	private static class Scanner {
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

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}