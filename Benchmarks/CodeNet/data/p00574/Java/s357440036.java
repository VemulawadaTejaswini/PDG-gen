import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int l = ir.nextInt();
		int q = ir.nextInt();
		int[] p = new int[1 << l];
		char[] s = ir.next().toCharArray();
		for (int i = 0; i < 1 << l; i++)
			p[i] = s[i] - '0';
		int[][] dp0 = new int[2][1 << l];
		int[][] dp1 = new int[2][1 << l];
		for (int i = 0; i < 1 << l; i++)
			dp0[0][i] = dp1[0][i] = p[i];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < 1 << l; j++) {
				dp0[i & 1 ^ 1][j] += dp0[i & 1][j];
				if ((j & 1 << i) != 0)
					dp0[i & 1 ^ 1][j] += dp0[i & 1][j ^ 1 << i];
				dp1[i & 1 ^ 1][j] += dp1[i & 1][j];
				if ((j & 1 << i) == 0)
					dp1[i & 1 ^ 1][j] += dp1[i & 1][j | 1 << i];
			}
			Arrays.fill(dp0[i & 1], 0);
			Arrays.fill(dp1[i & 1], 0);
		}
		ArrayList<Integer> pos = new ArrayList<Integer>();
		while (q-- > 0) {
			char[] t = ir.next().toCharArray();
			int[] ct = new int[3];
			for (int i = 0; i < l; i++) {
				if (t[i] == '?')
					ct[2]++;
				else
					ct[t[i] - '0']++;
			}
			if (ct[2] <= Math.min(ct[0], ct[1])) {
				int x = 0, ret = 0;
				for (int i = 0; i < l; i++) {
					if (t[i] == '?')
						pos.add(l - 1 - i);
					else if (t[i] == '1')
						x += 1 << (l - 1 - i);
				}
				for (int i = 0; i < 1 << ct[2]; i++) {
					int y = x;
					for (int j = 0; j < ct[2]; j++) {
						if ((i & 1 << j) != 0)
							y += 1 << pos.get(j);
					}
					ret += p[y];
				}
				out.println(ret);
			} else if (ct[1] <= Math.min(ct[0], ct[2])) {
				int x = 0, ret = 0;
				for (int i = 0; i < l; i++) {
					if (t[i] == '1')
						pos.add(l - 1 - i);
					else if (t[i] == '?')
						x += 1 << (l - 1 - i);
				}
				for (int i = 0; i < 1 << ct[1]; i++) {
					int y = x;
					for (int j = 0; j < ct[1]; j++) {
						if ((i & 1 << j) != 0)
							y += 1 << pos.get(j);
					}
					ret += Math.pow(-1, ct[1] - Integer.bitCount(i)) * dp0[l & 1][y];
				}
				out.println(ret);
			} else {
				int x = 0, ret = 0;
				for (int i = 0; i < l; i++) {
					if (t[i] == '0')
						pos.add(l - 1 - i);
					else if (t[i] == '1')
						x += 1 << (l - 1 - i);
				}
				for (int i = 0; i < 1 << ct[0]; i++) {
					int y = x;
					for (int j = 0; j < ct[0]; j++) {
						if ((i & 1 << j) == 0)
							y += 1 << pos.get(j);
					}
					ret += Math.pow(-1, ct[0] - Integer.bitCount(i)) * dp1[l & 1][y];
				}
				out.println(ret);
			}
			pos.clear();
		}
	}

	public static void main(String[] args) {
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

