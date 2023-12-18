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
		for (;;) {
			int n = ir.nextInt();
			if (n == 0)
				return;
			int[] p = ir.nextIntArray(n - 1);
			int[] d = ir.nextIntArray(n - 1);
			Graph[] g = new Graph[n];
			long[][] adj = new long[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(adj[i], Long.MAX_VALUE / 2);
				adj[i][i] = 0;
			}
			long ret = 0;
			boolean[] l = new boolean[n];
			for (int i = 0; i < n; i++)
				g[i] = new Graph();
			for (int i = 1; i < n; i++) {
				g[i].add(new int[] { p[i - 1] - 1, d[i - 1] });
				g[p[i - 1] - 1].add(new int[] { i, d[i - 1] });
				ret += d[i - 1];
			}
			for (int i = 0; i < n; i++)
				if (g[i].size() == 1)
					l[i] = true;
			for (int i = 0; i < n; i++) {
				if (l[i])
					continue;
				for (int j = 0; j < g[i].size(); j++) {
					int[] to = g[i].get(j);
					if (l[to[0]])
						continue;
					adj[i][to[0]] = to[1];
					ret += to[1];
				}
			}
			for (int k = 0; k < n; k++) {
				if (l[k])
					continue;
				for (int i = 0; i < n; i++) {
					if (l[i])
						continue;
					for (int j = 0; j < n; j++) {
						if (l[j])
							continue;
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			long ma = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < i; j++)
					if (adj[i][j] != Long.MAX_VALUE / 2)
						ma = Math.max(ma, adj[i][j]);
			out.println(ret - ma);
		}
	}

	static class Graph extends ArrayList<int[]> {
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

