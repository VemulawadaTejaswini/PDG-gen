// package beginner00175;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int n = in.ni();
		int m = in.ni();
		int K = in.ni();
		long[][] vals = new long[n][m];
		for (int i = 0; i < K; i++) {
			vals[in.ni() - 1][in.ni() - 1] = in.nl();
		}

		long[][][] dp = new long[n + 1][m + 1][4];
		for (int r = n - 1; r >= 0; r--) {
			for (int c = m - 1; c >= 0; c--) {
				long bestDown = max4(dp[r + 1][c][0], dp[r + 1][c][1], dp[r + 1][c][2],
						dp[r + 1][c][3]);
				for (int k = 0; k <= 3; k++) {
					long down = Math.max(bestDown, (k < 3 ? vals[r][c] : 0) + bestDown);
					long right = Math.max(dp[r][c + 1][k], (k < 3 ? vals[r][c] + dp[r][c + 1][k + 1]: dp[r][c + 1][k]));
					dp[r][c][k] = Math.max(down, right);
				}
//				{
//					long down = bestDown;
//					long right = dp[r][c + 1][0];
//					long getAndDown = vals[r][c] + bestDown;
//					long getAndRight = vals[r][c] + dp[r][c + 1][1];
//					dp[r][c][0] = max4(down, right, getAndDown, getAndRight);
//				}
//				{
//					long down = bestDown;
//					long right = dp[r][c + 1][1];
//					long getAndDown = vals[r][c] + bestDown;
//					long getAndRight = vals[r][c] + dp[r][c + 1][2];
//					dp[r][c][1] = max4(down, right, getAndDown, getAndRight);
//				}
//
//				{
//					long down = bestDown;
//					long right = dp[r][c + 1][2];
//					long getAndDown = vals[r][c] + bestDown;
//					long getAndRight = vals[r][c] + dp[r][c + 1][3];
//					dp[r][c][2] = max4(down, right, getAndDown, getAndRight);
//				}
//
//				{
//					long down = bestDown;
//					long right = dp[r][c + 1][3];
//					long getAndDown = bestDown;
//					long getAndRight = dp[r][c + 1][3];
//					dp[r][c][3] = max4(down, right, getAndDown, getAndRight);
//				}
			}
		}

//		for(int r = 0;r < n; r++ ) {
//			for (int c = 0; c < m; c++) {
//				System.out.print("[" + dp[r][c][0] +" , "+dp[r][c][1]+" , "+ dp[r][c][0] +" , "+dp[r][c][1] + "] ");
//			}
//			System.out.println();
//		}
		long ans = max4(dp[0][0][0], dp[0][0][1], dp[0][0][2], dp[0][0][3]);
		out.println(ans);

	}

	static best(int r, int c, long[][][] dp, long[] v) {
		
	}

	static long max4(long a, long b, long c, long d) {
		return Math.max(Math.max(a, b), Math.max(c, d));
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
