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
			int n = ir.nextInt();
			if (n == 0)
				return;
			P[] ps = new P[n];
			for (int i = 0; i < n; i++)
				ps[i] = new P(ir.nextDouble(), ir.nextDouble());
			int ret = 1;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sum(ps[i].sub(ps[j]).norm(), -2.0) <= 0.0) {
						P m = ps[i].add(ps[j]).mul(0.5);
						P t = ps[i].sub(ps[j]).perpendicular()
								.mul(Math.sqrt(sum(1.0, -Math.pow(m.sub(ps[i]).norm(), 2))));
						ret = Math.max(ret, check(m.add(t), ps, i, j));
						ret = Math.max(ret, check(m.add(t.mul(-1.0)), ps, i, j));
					}
				}
			}
			out.println(ret);
		}
	}

	static int check(P c, P[] ps, int a, int b) {
		int ret = 2;
		for (int i = 0; i < ps.length; i++) {
			if (i == a || i == b)
				continue;
			if (sum(1.0, -ps[i].sub(c).norm()) >= 0.0)
				ret++;
		}
		return ret;
	}

	static final double EPS = 1e-7;

	public static double sum(double a, double b) {
		if (Math.abs(a + b) < EPS * (Math.abs(a) + Math.abs(b)))
			return 0.0;
		return a + b;
	}

	static class P {

		public double x, y;

		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return this.x;
		}

		public double getY() {
			return this.y;
		}

		public double norm() {
			return Math.sqrt(sum(this.x * this.x, this.y * this.y));
		}

		public P add(P v) {
			return new P(sum(this.x, v.x), sum(this.y, v.y));
		}

		public P sub(P v) {
			return new P(sum(this.x, -v.x), sum(this.y, -v.y));
		}

		public P mul(double k) {
			return new P(this.x * k, this.y * k);
		}

		public double dot(P v) {
			return sum(this.x * v.x, this.y * v.y);
		}

		public double det(P v) {
			return sum(this.x * v.y, -this.y * v.x);
		}

		public P perpendicular() {
			return new P(this.y / norm(), -this.x / norm());
		}

		public String toString() {
			return String.valueOf(this.x) + " " + String.valueOf(this.y);
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

