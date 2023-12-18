import java.util.*;
import java.io.*;

public class Main {
	
	static int mod = (int)1e9+7;
	static int n;
	static int[][][] memo;
	
	public static int dp(int i, int zero, int nine) {
		if(i == n) {
			if(zero == 1 && nine == 1)
				return 1;
			else
				return 0;
		}
		
		if(memo[i][zero][nine] != -1)
			return memo[i][zero][nine];
		
		int cnt = (int)(((1l * dp(i + 1, 1, nine) + dp(i + 1, zero, 1)) % mod + 8l * dp(i + 1, zero, nine)) % mod);
		
		return memo[i][zero][nine] = cnt;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		n = sc.nextInt();
		if(n == 1) {
			pw.println(0);
		} else {
			memo = new int[n][2][2];
			for(int[][] j : memo)
				for(int[] i : j)
					Arrays.fill(i, -1);
			pw.println(dp(0, 0, 0));
		}
		
		pw.flush();
	}

	public static class Scanner {
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

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++)
				array[i] = new Integer(nextInt());
			return array;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		public static int[] shuffle(int[] a) {
			int n = a.length;
			Random rand = new Random();
			for (int i = 0; i < n; i++) {
				int tmpIdx = rand.nextInt(n);
				int tmp = a[i];
				a[i] = a[tmpIdx];
				a[tmpIdx] = tmp;
			}
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
