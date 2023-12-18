import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static long inf = (long) 1e16;
	static int n, c, t, r;
	static ArrayList<Integer>[] ad;
	static long[][][] memo;
	static boolean f;
	static boolean[] vis[];
	static long[][] mat;
	static int[] ans, a;
	static TreeMap<pair, Long> tm;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		r = sc.nextInt();
		c = sc.nextInt();
		memo = new long[r][c][4];
		for (long[][] h : memo)
			for (long[] hh : h)
				Arrays.fill(hh, -1);
		tm = new TreeMap<>();
		int k = sc.nextInt();
		mat = new long[r][c];
		for (int i = 0; i < k; i++)
			mat[sc.nextInt() - 1][sc.nextInt() - 1] = sc.nextLong();
		System.out.println(dp(0, 0, 3));
		out.flush();
	}

	static long dp(int i, int j, int left) {
		if (i == r || j == c)
			return 0;
		if (memo[i][j][left] != -1)
			return memo[i][j][left];
		long ans = Math.max(dp(i + 1, j, 3), dp(i, j + 1, left));
		if (left > 0 && mat[i][j] > 0) {
			ans = Math.max(ans, Math.max(dp(i + 1, j, 3) + mat[i][j], dp(i, j + 1, left - 1) + mat[i][j]));
		}
		return memo[i][j][left] = ans;
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + " " + y;
		}

		@Override
		public int compareTo(pair o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
