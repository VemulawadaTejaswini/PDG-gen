
import java.io.*;
import java.util.*;
import java.math.*;
import java.net.StandardSocketOptions;

 class Main {

	static long sx = 0, sy = 0, mod = (long) (998244353);

	static ArrayList<Integer>[] a;
	// static ArrayList<Long> p;
	static HashMap<ArrayList<Integer>, Long> hm = new HashMap<>();
	static Double[][] dp;
	static boolean[][] vis;
	static long[] far;
	static int[] fa;
	public static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<pair> pa = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	static long mo = (long) (1e9 + 7);
	static int[] c, col;
	// static int n = 0, m, x, k;
	// static int ans = Integer.MAX_VALUE;
	static boolean b = false;
	static boolean[] reach = new boolean[6000];
	static int[][] par;
	static int[] depth;
	static int[] size;
	static long[] pow;
	static int time = 0;
	static int[] disc;
	static int[] low;
	static char[][] ch;
	// static TreeSet<Integer> hm = new TreeSet<>();

	static double p, q;

	static int cnt = 0;
	static int[][] dirs = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, };

	public static void main(String[] args) throws IOException {

		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		// Reader scn = new Reader();

		int n = scn.nextInt();

		int[] dp = new int[n + 1];

		for (int i = 1; i <= 100; i++) {

			for (int j = 1; j <= 100; j++) {

				for (int k = 1; k <= 100; k++) {

					int val = i * i + j * j + k * k + i * j + j * k + k * i;

					if (val <= n)
						dp[val]++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(dp[i]);
			sb.append("\n");
		}

		System.out.println(sb);

	}

	public static int f(long val) {

		int ans = 0;

		while (val != 0) {

			val = val % popcount(val);
			ans++;
		}
		return ans;
	}

	public static int popcount(long val) {

		int ans = 0;

		for (int i = 62; i >= 0; i--)
			if (((val >> i) & 1) == 1)
				ans++;

		return ans;
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
	public static long pow(long a, long b) {

		long mod = 0;

		if (b < 0)
			return 0;
		if (b == 0 || b == 1)
			return (long) Math.pow(a, b);

		if (b % 2 == 0) {

			long ret = pow(a, b / 2);
			mod = popcount(ret);
			ret = (ret % mod * ret % mod) % mod;
			return ret;
		}

		else {
			return ((pow(a, b - 1, mod) % mod) * a % mod) % mod;
		}
	}

	private static class pair implements Comparable<pair> {

		long a, o;

		pair(long a, long o) {
			this.a = a;
			this.o = o;
		}

		@Override
		public int compareTo(pair o) {

			return 1;

		}

		// @Override
		//
		// public int hashCode() {
		// return i;
		// }
		//
		// @Override
		//
		// public boolean equals(Object o) {
		//
		// pair p = (pair) o;
		// return this.i == p.i;
		// }

	}

	private static class pair1 {

		int a, b;

		pair1(int a, int b) {
			this.a = a;
			this.b = b;
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
