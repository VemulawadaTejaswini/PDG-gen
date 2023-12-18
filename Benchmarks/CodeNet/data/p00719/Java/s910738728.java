import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			int m = ir.nextInt();
			int p = ir.nextInt();
			int a = ir.nextInt() - 1;
			int b = ir.nextInt() - 1;
			if (n == 0 && m == 0 && p == 0)
				return;
			int[] t = ir.nextIntArray(n);
			Graph[] g = new Graph[m];
			for (int i = 0; i < m; i++)
				g[i] = new Graph();
			for (int i = 0; i < p; i++) {
				int x = ir.nextInt() - 1;
				int y = ir.nextInt() - 1;
				int z = ir.nextInt();
				g[x].add(new int[] { y, z });
				g[y].add(new int[] { x, z });
			}
			double[][] d = new double[m][1 << n];
			for (int i = 0; i < m; i++)
				Arrays.fill(d[i], 1 << 30);
			PriorityQueue<double[]> pq = new PriorityQueue<double[]>(new Comparator<double[]>() {
				public int compare(double[] A, double[] B) {
					return Double.compare(B[2], A[2]);
				}
			});
			d[a][(1 << n) - 1] = 0;
			pq.add(new double[] { a, (1 << n) - 1, 0 });
			while (!pq.isEmpty()) {
				double[] from = pq.poll();
				for (int i = 0; i < g[(int) from[0]].size(); i++) {
					int[] to = g[(int) from[0]].get(i);
					for (int j = 0; j < n; j++) {
						if (((int) from[1] & (1 << j)) != 0
								&& d[to[0]][(int) from[1] ^ (1 << j)] > d[(int) from[0]][(int) from[1]]
										+ (double) to[1] / t[j]) {
							d[to[0]][(int) from[1] ^ (1 << j)] = d[(int) from[0]][(int) from[1]]
									+ (double) to[1] / t[j];
							pq.add(new double[] { to[0], (int) from[1] ^ (1 << j),
									d[(int) to[0]][(int) from[1] ^ (1 << j)] });
						}
					}
				}
			}
			double mi = 1 << 30;
			for (int i = 0; i < 1 << n; i++)
				mi = Math.min(mi, d[b][i]);
			if (mi == 1 << 30) {
				out.println("Impossible");
			} else {
				out.println(mi);
			}
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

