
import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;

/*
By : SSD
*/

public class Main {
	long mod = (long) (1e9 + 7);

	static class InputReader1 {

		private final InputStream st;
		private final byte[] buf = new byte[8192];
		private int cc, sc;
		private SpaceCharFilter f;

		public InputReader1(InputStream st) {
			this.st = st;
		}

		public int t() {
			if (sc == -1)
				throw new InputMismatchException();
			if (cc >= sc) {
				cc = 0;
				try {
					sc = st.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (sc <= 0)
					return -1;
			}
			return buf[cc++];
		}

		public int nextInt() {
			int c = t();
			while (isSpaceChar(c)) {
				c = t();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = t();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = t();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = t();
			while (isSpaceChar(c)) {
				c = t();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = t();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = t();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public String readString() {
			int c = t();
			while (isSpaceChar(c)) {
				c = t();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = t();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = t();
			while (isSpaceChar(c))
				c = t();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = t();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (f != null)
				return f.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}

	class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0) {
					writer.print(' ');
				}
				writer.print(objects[i]);
			}
		}

		public void println(Object... objects) {
			print(objects);
			writer.println();
		}

		public void close() {
			writer.close();
		}
	}

	InputReader1 sc;
	OutputWriter out;

	public static void main(String[] ssd) throws Exception {
		new Main().run();
	}

	void run() throws Exception {

		sc = new InputReader1(System.in);

		out = new OutputWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		tr(System.currentTimeMillis() - s + "ms");
		out.close();

	}

	private void solve() {
		int n = sc.nextInt(), x = sc.nextInt(), t = sc.nextInt();

		out.println((n + x - 1) / x * t);

	}

	private boolean oj = System.getProperty("ONLINE_JUDGE") != null;

	private void tr(Object... o) {
		if (!oj)
			out.println(Arrays.deepToString(o));
	}
}
