package grand00049;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int n = in.ni();
		String[] strs = in.nsa(n);
		Arrays.sort(strs, new Comparator<String>() {
			public int compare(String a, String b) {
				int lena = a.length();
				int lenb = b.length();
				return lena - lenb;
			}
		});

		RollingHash[] rls = new RollingHash[n];
		for (int i = 0; i < n; i++)
			rls[i] = new RollingHash(strs[i].length(), new RollingHashFactory(2, strs[i].length(), new Random()));
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < strs[r].length(); c++)
				rls[r].add(strs[r].charAt(c));
		}

		int[][][] f = new int[n][][];
		for (int r = 0; r < n; r++) {
			String s = strs[r];
			int[][] ff = new int[26][s.length()];
			for (int c = 0; c < s.length(); c++) {
				ff[s.charAt(c) - 'a'][c]++;
			}
			for (int c = 1; c < s.length(); c++) {
				for (int ch = 0; ch < 26; ch++) {
					ff[ch][c] += ff[ch][c - 1];
				}
			}
			f[r] = ff;
		}

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (strs[i].length() > 1) {
					int len = strs[i].length() - 1;
					int fromi = 1;
					int toi = strs[i].length() - 1;
					long hashi = rls[i].query(fromi, toi)[0];
					int fromj = strs[j].length() - len;
					int toj = strs[j].length() - 1;
					long hashj = rls[j].query(fromj, toj)[0];
//					System.out.println(strs[i].substring(fromi, toi + 1) + " " + hashi + " "
//							+ strs[j].substring(fromj, toj + 1) + " " + hashj);
					if (hashi != hashj)
						continue;
					if (!equal(strs[i], fromi, toi, strs[j], fromj, toj))
						continue;
				}
//				System.out.println(strs[i] + " " + strs[j]);
				int first = strs[i].charAt(0) - 'a';
				if (get(f[j], 0, strs[j].length() - strs[i].length(), first) > 0)
					ans++;
			}
		}
		System.out.println(ans);
	}

	static boolean equal(String a, int froma, int toa, String b, int fromb, int tob) {
		while (froma <= toa) {
			if (a.charAt(froma++) != b.charAt(fromb++))
				return false;
		}
		return true;
	}

	static int get(int[][] f, int from, int to, int c) {
		if (from == 0)
			return f[c][to];
		return f[c][to] - f[c][from - 1];
	}

	static class RollingHash {
		public RollingHashFactory rhf;
		public long[][] buf;
		public int p;

		public RollingHash(int bufsize, RollingHashFactory rhf) {
			buf = new long[rhf.deg][bufsize + 1];
			this.rhf = rhf;
			this.p = 1;
		}

		public void add(int c) {
			for (int i = 0; i < rhf.deg; i++)
				buf[i][p] = (buf[i][p - 1] * rhf.muls[i] + c) % rhf.mods[i];
			p++;
		}

		public void addr(int c) {
			for (int i = 0; i < rhf.deg; i++)
				buf[i][p] = (buf[i][p - 1] + rhf.powers[i][p - 1] * c) % rhf.mods[i];
			p++;
		}

		public long queryTwin(int r) {
			return buf[0][r] << 32 | buf[1][r];
		}

		public long queryTwin(int l, int r) {
			assert l <= r;
			assert rhf.deg == 2;
			long h = 0;
			for (int i = 0; i < rhf.deg; i++) {
				long v = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
				if (v < 0)
					v += rhf.mods[i];
				h = h << 32 | v;
			}
			return h;
		}

		public long[] query(int l, int r) {
			assert l <= r;
			long[] h = new long[rhf.deg];
			for (int i = 0; i < rhf.deg; i++) {
				h[i] = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
				if (h[i] < 0)
					h[i] += rhf.mods[i];
			}
			return h;
		}

		public long add(long a, long b, int w, RollingHashFactory rhf) {
			assert rhf.deg == 2;
			long high = ((a >>> 32) * rhf.powers[0][w] + (b >>> 32)) % rhf.mods[0];
			long low = ((long) (int) a * rhf.powers[1][w] + (int) b) % rhf.mods[1];
			return high << 32 | low;
		}
	}

	static class RollingHashFactory {
		public int[] mods;
		public int[] muls;
		public long[][] powers;
		public int deg;

		public RollingHashFactory(int deg, int n, Random gen) {
			this.deg = deg;
			mods = new int[deg];
			muls = new int[deg];
			mods[0] = 1000000007;
			mods[1] = 1000000009;
			muls[0] = 31;
			muls[1] = 31;
			powers = new long[deg][n + 1];
			for (int i = 0; i < deg; i++) {
				powers[i][0] = 1;
				for (int j = 1; j <= n; j++) {
					powers[i][j] = powers[i][j - 1] * muls[i] % mods[i];
				}
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
