
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.awt.*;

 class Main {

	static long sx = 0, sy = 0, mod = (long) (1e9 + 7);

	static ArrayList<Integer>[] a;
	static Integer[][] dp;
	static long[] fa;
	static long[] farr;
	public static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<pair> pa = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	static long m = 998244353;
	static long[] no, col;
	static String s;
	static long k = 0, n = 0, one = 0;
	static int cnt;
	// static long[] dp;
	// static long[] p;
	static long[] ans;
	// static Double[][] a = new Double[2][2];
	static Double[][] b = new Double[2][2];
	static Double[] x;
	static Double[] y;
	static Double[] dis;
	// static boolean b = true;
	static int[][] par;
	static int[] depth;
	static HashMap<Integer, Integer> map;
	static ArrayList<Integer> p;

	public static void main(String[] args) throws IOException {

		// Scanner scn = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));

		Reader scn = new Reader();

		int n = scn.nextInt();

		int k = scn.nextInt();
		int[][] a = scn.nextInt2DArray(k, 2);

		long[] dp = new long[n + 1];

		dp[n] = 1;
		segment_array s = new segment_array();
		s.preprocess(dp);
		s.update(n, 1);

		for (int i = n - 1; i >= 1; i--) {

			for (int j = 0; j < a.length; j++) {

				int l = i + a[j][0], r = Math.min(n, i + a[j][1]);

				dp[i] += s.query(l, r);
				dp[i] %= m;
			}
			
			s.update(i, dp[i]);
		}

		System.out.println(dp[1]);

	}

	private static class segment_array {

		static long[] sa;
		static long[] oba;

		public static void preprocess(long[] ba) {
			oba = ba;
			int h = getlog(ba.length);
			int size = (1 << (h + 1)) - 1;

			sa = new long[size];

			construct(0, 0, ba.length - 1);
		}

		private static void construct(int si, int ssi, int sei) {

			if (ssi == sei) {
				sa[si] = oba[ssi];
				return;
			}

			int mid = (ssi + sei) / 2;

			construct(2 * si + 1, ssi, mid);
			construct(2 * si + 2, mid + 1, sei);

			sa[si] = sa[2 * si + 1] + sa[2 * si + 2];

		}

		public static long query(int qsi, int qei) {
			if (qsi > qei)
				return 0;
			return query(0, 0, oba.length - 1, qsi, qei);
		}

		private static long query(int si, int ssi, int sei, int qsi, int qei) {

			if (ssi >= qsi && sei <= qei)
				return sa[si];

			else if (ssi > qei || sei < qsi)
				return 0;

			else {
				int mid = (ssi + sei) / 2;
				return (query(2 * si + 1, ssi, mid, qsi, qei) % m + query(2 * si + 2, mid + 1, sei, qsi, qei) % m) % m;
			}

		}

		public static void update(int i, long val) {
			update(0, 0, oba.length - 1, i, val);
		}

		private static void update(int si, int ssi, int sei, int idx, long val) {

			if (ssi == idx && sei == idx) {
				sa[si] = val;
				oba[idx] = val;
				return;
			}

			int mid = (ssi + sei) / 2;

			if (idx <= mid)
				update(2 * si + 1, ssi, mid, idx, val);
			else
				update(2 * si + 2, mid + 1, sei, idx, val);

			sa[si] = (sa[2 * si + 1] % m + sa[2 * si + 2] % m) % m;

		}

		public static int getlog(int n) {
			int log = 0;

			while ((1 << log) < n)
				log++;

			return log;
		}

	}

	// _________________________TEMPLATE_____________________________________________________________

	// public static long lcm(long x, long y) {
	//
	// return (x * y) / gcd(x, y);
	// }
	//
	// private static long gcd(long x, long y) {
	// if (x == 0)
	// return y;
	//
	// return gcd(y % x, x);
	// }
	//
	// static class comp implements Comparator<Integer> {
	//
	// @Override
	// public int compare(Integer p1, Integer p2) {
	//
	// return p2 - p1;
	//
	// }
	// }
	//
	// }
	//
	// public static long pow(long a, long b) {
	//
	// if (b < 0)
	// return 0;
	// if (b == 0 || b == 1)
	// return (long) Math.pow(a, b);
	//
	// if (b % 2 == 0) {
	//
	// long ret = pow(a, b / 2);
	// ret = (ret % mod * ret % mod) % mod;
	// return ret;
	// }
	//
	// else {
	// return ((pow(a, b - 1) % mod) * a % mod) % mod;
	// }
	// }

	private static class pair implements Comparable<pair> {

		int val, cnt;

		pair(int a, int b) {
			val = a;
			cnt = b;
		}

		@Override
		public int compareTo(pair o) {

			return this.val - o.val;
		}

		@Override

		public int hashCode() {
			return val * 17 + cnt * 31;
		}

		@Override

		public boolean equals(Object o) {

			pair p = (pair) o;
			return this.val == p.val && this.cnt == p.cnt;
		}

	}

	private static String reverse(String s) {

		return new StringBuilder(s).reverse().toString();
	}

	public static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1000000 + 1]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public int[][] nextInt2DArray(int m, int n) throws IOException {
			int[][] arr = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}

		public long[][] nextInt2DArrayL(int m, int n) throws IOException {
			long[][] arr = new long[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}
		// kickstart - Solution
		// atcoder - Main
	}

}