import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		for (;;) {
			String s = ir.next();
			if (s.charAt(0) == '.')
				return;
			int ret = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						String t = s.replace("P", String.valueOf(i)).replace("Q", String.valueOf(j)).replace("R",
								String.valueOf(k));
						if (calc(t) == 2)
							ret++;
					}
				}
			}
			out.println(ret);
		}
	}

	static int calc(String s) {
		if (s.charAt(0) != '(')
			return convert(s);
		else {
			int d = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(')
					d++;
				else if (s.charAt(i) == ')')
					d--;
				else if (d == 1 && (s.charAt(i) == '+' || s.charAt(i) == '*')) {
					if (s.charAt(i) == '+')
						return Math.max(calc(s.substring(1, i)), calc(s.substring(i + 1, s.length() - 1)));
					else
						return Math.min(calc(s.substring(1, i)), calc(s.substring(i + 1, s.length() - 1)));
				}
			}
		}
		return -1;
	}

	static int convert(String s) {
		int p = 0;
		while (p < s.length() && s.charAt(p) == '-')
			p++;
		if (s.length() - p == 1) {
			int a = Integer.parseInt(s.substring(s.length() - 1));
			if (a == 1)
				return 1;
			if (s.length() % 2 == 0)
				return (a + 2) % 4;
			else
				return a;
		} else {
			int a = calc(s.substring(p));
			if (a == 1)
				return 1;
			if (p % 2 == 1)
				return (a + 2) % 4;
			else
				return a;
		}
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}

