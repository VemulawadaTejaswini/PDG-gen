import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static int inf = (int) 1e8;
	static int[] col;
	static int n, s, k;
	static ArrayList<Integer>[] ad;
	static int[][][] memo;
	static ArrayList<Integer> h;
	static char[][] grid;
	static int[] a;
	static boolean f;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		s = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		long ans = 0;
		memo=new int [n][n+1][s+1];
		for(int [][]kk:memo)
			for(int []h:kk)
				Arrays.fill(h, -1);
		for (int i = 1; i <= n; i++) {
			long tem = (dp(0, i, s) * modPow(2, n - i))%mod;
			ans=(ans+tem)%mod;

		}
		System.out.println(ans);
		out.flush();
	}

	static long modPow(long a, long e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}

	static int dp(int i, int ele, int sum) {
		if (sum < 0 || ele < 0)
			return 0;
		if (i == n) {
			if (ele == 0 && sum == 0)
				return 1;
			return 0;
		}
		if (memo[i][ele][sum] != -1)
			return memo[i][ele][sum];
		int ans = dp(i + 1, ele, sum);
		ans = ans + dp(i + 1, ele - 1, sum - a[i]);
		if (ans >= mod)
			ans -= mod;
		return memo[i][ele][sum] = ans;
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