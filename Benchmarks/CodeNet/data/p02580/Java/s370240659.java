// package beginner00176;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int H = in.ni();
		int W = in.ni();
		int P = in.ni();
		int[] rs = new int[P];
		int[] cs = new int[P];
		int minR = Integer.MAX_VALUE;
		int minC = Integer.MAX_VALUE;
		int maxR = Integer.MIN_VALUE;
		int maxC = Integer.MIN_VALUE;
		int[] onRow;
		int[] onCol;
		HashSet<Long> points = new HashSet<>();
		Queue<Integer> candRows = new LinkedList<>();
		Queue<Integer> candCols = new LinkedList<>();

		for (int i = 0; i < P; i++) {
			rs[i] = in.ni();
			cs[i] = in.ni();
			minR = Math.min(minR, rs[i]);
			minC = Math.min(minC, cs[i]);
			maxR = Math.max(maxR, rs[i]);
			maxC = Math.max(maxC, cs[i]);
			points.add(((long) rs[i] << 32) | cs[i]);
		}

		onRow = new int[maxR + 1];
		onCol = new int[maxC + 1];

		for (int i = 0; i < P; i++) {
			int r = rs[i], c = cs[i];
			onRow[r]++;
			onCol[c]++;
		}

		int maxOnRow = Arrays.stream(onRow).parallel().max().getAsInt();
		int maxOnCol = Arrays.stream(onCol).parallel().max().getAsInt();

		for (int r = minR; r <= maxR; r++)
			if (onRow[r] == maxOnRow)
				candRows.add(r);
		for (int c = minC; c <= maxC; c++)
			if (onCol[c] == maxOnCol)
				candCols.add(c);

		int ans = maxOnRow + maxOnCol - 1;
		outer: for (int row : candRows) {
			for (int col : candCols) {
				if (!points.contains(((long) row << 32) | col)) {
					ans++;
					break outer;
				}
			}
		}
		out.println(ans);

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
