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
	static boolean debug = true;

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			int m = ir.nextInt();
			int c = ir.nextInt();
			int a = ir.nextInt() - 1;
			int b = ir.nextInt() - 1;
			if (n == 0)
				return;
			Graph[] g = new Graph[n];
			for (int i = 0; i < n; i++)
				g[i] = new Graph();
			int[] l = new int[c];
			for (int i = 0; i < m; i++) {
				int x = ir.nextInt() - 1;
				int y = ir.nextInt() - 1;
				int d = ir.nextInt();
				int cc = ir.nextInt() - 1;
				l[cc] += d;
				g[x].add(new int[] { y, d, cc });
				g[y].add(new int[] { x, d, cc });
			}
			int[] p = ir.nextIntArray(c);
			int[][] q = new int[c][];
			int[][] r = new int[c][];
			int[][] sum = new int[c][];
			for (int i = 0; i < c; i++) {
				q[i] = new int[p[i]];
				sum[i] = new int[p[i]];
				for (int j = 1; j < p[i]; j++)
					q[i][j] = ir.nextInt();
				r[i] = ir.nextIntArray(p[i]);
				for (int j = 1; j < p[i]; j++)
					sum[i][j] = sum[i][j - 1] + (q[i][j] - q[i][j - 1]) * r[i][j - 1];
			}
			int[][][] d = new int[n][c][];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < c; j++)
					d[i][j] = new int[l[j] + 201];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < c; j++) {
					Arrays.fill(d[i][j], 1 << 30);
				}
			}
			PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
				public int compare(int[] A, int[] B) {
					return A[1] - B[1];
				}
			});
			for (int i = 0; i < c; i++)
				d[a][i][0] = 0;
			pq.add(new int[] { a, 0, 0, 0 });
			while (!pq.isEmpty()) {
				int[] e = pq.poll();
				int from = e[0];
				for (int i = 0; i < g[from].size(); i++) {
					int[] to = g[from].get(i);
					if (to[0] == from)
						continue;
					int pre = e[2] == to[2] ? e[3] : 0;
					if (to[1] + pre > l[to[2]])
						continue;
					int idx = upper_bound(q[to[2]], 0, p[to[2]] - 1, to[1] + pre) - 1;
					int cost = 0;
					cost += sum[to[2]][idx];
					cost += (to[1] + pre - q[to[2]][idx]) * r[to[2]][idx];
					idx = upper_bound(q[to[2]], 0, p[to[2]] - 1, pre) - 1;
					cost -= sum[to[2]][idx];
					cost -= (pre - q[to[2]][idx]) * r[to[2]][idx];
					if (d[to[0]][to[2]][to[1] + pre] > d[from][e[2]][e[3]] + cost) {
						d[to[0]][to[2]][to[1] + pre] = d[from][e[2]][e[3]] + cost;
						pq.add(new int[] { to[0], d[to[0]][to[2]][to[1] + pre], to[2], to[1] + pre });
					}
				}
			}
			int mi = 1 << 30;
			for (int i = 0; i < c; i++) {
				for (int j = 0; j <= l[i]; j++) {
					mi = Math.min(mi, d[b][i][j]);
				}
			}
			out.println(mi == 1 << 30 ? -1 : mi);
		}
	}

	public static int lower_bound(int[] a, int fromIndex, int toIndex, int val) {
		if (val > a[toIndex])
			return toIndex + 1;
		if (val <= a[fromIndex])
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a[mid] >= val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	public static int upper_bound(int[] a, int fromIndex, int toIndex, int val) {
		if (val >= a[toIndex])
			return toIndex + 1;
		if (val < a[fromIndex])
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a[mid] > val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
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

