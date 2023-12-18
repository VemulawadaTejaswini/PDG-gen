// package beginner00176;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	private static PrintWriter out;

	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int n = in.ni();
		int m = in.ni();
		int r1 = in.ni() - 1;
		int c1 = in.ni() - 1;
		int r2 = in.ni() - 1;
		int c2 = in.ni() - 1;
		char[][] grid = new char[n][m];
		for (int i = 0; i < n; i++)
			grid[i] = in.ns().toCharArray();

		int[] dsu = new int[n * m];
		Arrays.fill(dsu, Integer.MAX_VALUE);
		dsu[flatten(r1, c1, m)] = 0;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { r1, c1 });
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			int src = flatten(r, c, m);
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr < 0 || nc < 0 || nr >= n || nc >= m || grid[nr][nc] == '#')
					continue;
				int dest = flatten(nr, nc, m);
				if (dsu[dest] > dsu[src]) {
					dsu[dest] = dsu[src];
					q.add(new int[] { nr, nc });
				}
			}

			for (int nr = r - 2; nr <= r + 2; nr++) {
				for (int nc = c - 2; nc <= c + 2; nc++) {
					if (nr < 0 || nc < 0 || nr >= n || nc >= m || grid[nr][nc] == '#')
						continue;
					if (nr == r || nc == c)
						continue;
					int dest = flatten(nr, nc, m);
					if (dsu[dest] > dsu[src] + 1) {
						dsu[dest] = dsu[src] + 1;
						q.add(new int[] {nr,nc});
					}
				}
			}
		}
//		System.out.println(Arrays.toString(dsu));

		int dest = flatten(r2, c2, m);
		int ans = dsu[dest] == Integer.MAX_VALUE ? -1 : dsu[dest];
		System.out.println(ans);

//		WeightedQuickUnion dsu = new WeightedQuickUnion(n * m);
//		for (int r = 0; r < n; r++) {
//			for (int c = 0; c < n; c++) {
//				if (grid[r][c] == '#')
//					continue;
//				for (int d = 0; d < 4; d++) {
//					int nr = r + dr[d];
//					int nc = c + dc[d];
//					if (nr < 0 || nc < 0 || nr >= n || nc >= m || grid[nr][nc] == '#')
//						continue;
//					int src = flatten(r, c, m);
//					int dest = flatten(nr, nc, m);
//					dsu.union(src, dest);
//				}
//			}
//		}
//		
//		int SRC = flatten(r1, c1, m);
//		int DEST = flatten(r2, c2, m);
//		int DEST_PARENT = dsu.find(DEST);
//		
//		if (dsu.connected(SRC, DEST)) {
//			System.out.println(0);
//			return;
//		}
//		Map<Integer, Integer> map = new HashMap<>();
//		map.put(dsu.find(SRC), 0);
//		Queue<int[]> q = new LinkedList<>();
//		q.add(new int[] { r1, c1 });
//		int step = 0;
//		while (!q.isEmpty()) {
//			step++;
//			for (int qq = 0, len = q.size(); qq < len; qq++) {
//				int[] cur = q.poll();
////				System.out.println(cur[0] + " " + cur[1]);
//				int r = cur[0];
//				int c = cur[1];
//				int src = flatten(r, c, m);
//
//				List<int[]> component = component(r, c, dsu, grid);
////			for(int[] a : component) {
////				System.out.print(Arrays.toString(a) + " ");
////			}
////			System.out.println();
//				for (int[] node : component) {
////				System.out.println("checking node " + node[0] + " " + node[1]);
//					for (int i = node[0] - 2; i <= node[0] + 2; i++) {
//						if (i < 0 || i >= n)
//							continue;
//
//						for (int j = node[1] - 2; j <= node[1] + 2; j++) {
////						System.out.println("    checking " + i + " " + j);
//							if (j < 0 || j >= m || grid[i][j] == '#')
//								continue;
//							if (i == node[0] && j == node[1])
//								continue;
////						System.out.println("    " + i + " " + j);
//							int dest = flatten(i, j, m);
//							int destParent = dsu.find(dest);
//							if (dsu.connected(src, dest) || map.containsKey(destParent))
//								continue;
//
//							if (destParent == DEST_PARENT) {
//								System.out.println(step);
//								return;
//							}
//
//							map.put(dsu.find(dest), step);
//							q.add(new int[] { i, j });
//						}
//					}
//				}
//			}
//		}
//		System.out.println(-1);
	}

	static List<int[]> component(int r, int c, WeightedQuickUnion dsu, char[][] grid) {
		int n = grid.length, m = grid[0].length;
		boolean[][] seen = new boolean[n][m];
		List<int[]> list = new LinkedList<>();
		Queue<int[]> q = new LinkedList<>();

		seen[r][c] = true;
		list.add(new int[] { r, c });
		q.add(new int[] { r, c });
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			for (int d = 0; d < 4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
				if (nr < 0 || nc < 0 || nr >= n || nc >= m || grid[nr][nc] == '#' || seen[nr][nc])
					continue;
				seen[nr][nc] = true;
				list.add(new int[] { nr, nc });
				q.add(new int[] { nr, nc });
			}
		}
		return list;
	}

	static int flatten(int r, int c, int C) {
		return r * C + c;
	}

	static class WeightedQuickUnion {
		int[] id;
		int[] sz;
		int componentCount;

		public WeightedQuickUnion(int n) {
			id = new int[n];
			for (int i = 0; i < n; i++)
				id[i] = i;
			sz = new int[n];
			Arrays.fill(sz, 1);
			componentCount = n;
		}

		public int componentCount() {
			return componentCount;
		}

		public int find(int v) {
			validate(v);
			while (v != id[v]) {
				id[v] = id[id[v]];
				v = id[v];
			}
			return v;
		}

		public boolean connected(int v, int w) {
			validate(v);
			validate(w);
			int p = find(v);
			int q = find(w);
			return p == q;
		}

		public void union(int v, int w) {
			validate(v);
			validate(w);
			int p = find(v);
			int q = find(w);
			if (p == q)
				return;
			if (sz[p] >= sz[q]) {
				id[q] = p;
				sz[p] += sz[q];
			} else {
				id[p] = q;
				sz[q] += sz[p];
			}
			componentCount--;
		}

		private void validate(int v) {
			if (v < 0 || v >= id.length) {
				throw new IllegalArgumentException("v should be between 0 and " + (id.length - 1));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// long start = System.nanoTime();
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		// System.out.println("Elapsed: " + (System.nanoTime() - start) / 1000000 +
		// "ns");
	}

	@SuppressWarnings("unused")
	private static class In {
		final private static int BUFFER_SIZE = 1024;
		private byte[] buf;
		private InputStream is;
		private int buflen;
		private int bufptr;

		public In() {
			is = System.in;
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public In(String input) {
			is = new ByteArrayInputStream(input.getBytes());
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public int readByte() {
			if (bufptr >= buflen) {
				try {
					buflen = is.read(buf);
				} catch (IOException ioe) {
					throw new InputMismatchException();
				}
				bufptr = 0;
			}
			if (buflen <= 0)
				return -1;
			return buf[bufptr++];
		}

		public boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		public int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		/* Next character */
		public char nc() {
			return (char) skip();
		}

		/* Next double */
		public double nd() {
			return Double.parseDouble(ns());
		}

		/* Next string */
		public String ns() {
			final StringBuilder sb = new StringBuilder();
			int b = skip();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		/* Next integer */
		public int ni() {
			boolean minus = false;
			int num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next long */
		public long nl() {
			boolean minus = false;
			long num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next integer 1D array */
		public int[] nia(int n) {
			final int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = ni();
			return arr;
		}

		/* Next long 1D array */
		public long[] nla(int n) {
			final long[] arr = new long[n];
			for (int i = 0; i < n; i++)
				arr[i] = nl();
			return arr;
		}

		/* Next string 1D array */
		public String[] nsa(int n) {
			final String[] arr = new String[n];
			for (int i = 0; i < n; i++)
				arr[i] = ns();
			return arr;
		}

		/* Next char 1D array */
		public char[] nca(int n) {
			final char[] arr = new char[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next double 1D array */
		public double[] nda(int n) {
			final double[] arr = new double[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next integer matrix */
		public int[][] nim(int n, int m) {
			final int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ni();
			return arr;
		}

		/* Next long matrix */
		public long[][] nlm(int n, int m) {
			final long[][] arr = new long[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nl();
			return arr;
		}

		/* Next string matrix */
		public String[][] nsm(int n, int m) {
			final String[][] arr = new String[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ns();
			return arr;
		}

		/* Next char matrix */
		public char[][] ncm(int n, int m) {
			final char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nc();
			return arr;
		}

		/* Next double matrix */
		public double[][] ndm(int n, int m) {
			final double[][] arr = new double[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nd();
			return arr;
		}

		public static void log(Object... o) {
			System.out.println(Arrays.deepToString(o));
		}
	}

}
