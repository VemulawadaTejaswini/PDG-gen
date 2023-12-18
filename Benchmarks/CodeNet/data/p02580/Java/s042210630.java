// package beginner00176;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int h = in.ni();
		int w = in.ni();
		int t = in.ni();
		int[][] a = new int[t][];
		int maxY = 0;
		for(int i = 0; i < t; i++) {
			a[i] = in.nia(2);
			maxY = Math.max(maxY, a[i][1]);
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
				return Integer.compare(a[1], b[1]);
			}
		});
		
		int[] onCol = new int[maxY + 1];
		boolean[] occupied = new boolean[maxY + 1];
		int maxOnRow = 0;
		int i = 0;
		while(i < t) {
			boolean[] occupied2 = new boolean[occupied.length];
			occupied2[a[i][1]] = true;
			int nTargets = 1;
			onCol[a[i][1]]++;
			int j = i + 1;
			while(j < t && a[i][0] == a[j][0]) {
				nTargets++;
				onCol[a[j][1]]++;
				occupied2[a[j][1]] = true;
				j++;
			}
			if (nTargets > maxOnRow) {
				maxOnRow = nTargets;
				occupied = occupied2;
			}
			i = j;
		}
		
		int ans = Integer.MIN_VALUE;
		for(int col  = 0; col < maxY; col++) {
			int cand = maxOnRow + onCol[col] - (occupied[col] ? 1 : 0);
			ans = Math.max(ans, cand);
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
