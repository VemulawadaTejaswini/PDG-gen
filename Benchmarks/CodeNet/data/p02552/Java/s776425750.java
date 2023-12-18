
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main implements Runnable {

	static long mod = (long)(1e9 + 7L);

	public long Pow(long x, long y) {
		
		if(y == 0L)
			return 1L;
		
		if(y == 1L)
			return x;

		long pow = y;
		long ans = 1L;

		while (pow > 0) {

			if ((pow & 1) == 1)
				ans = (ans * x) % mod;

			pow /= 2;
			x = (x * x) % mod;
		}
		return ans % mod;
	}

	public static void main(String[] args) throws Exception {

		new Thread(null, new Main(), "SwapnilGanguly", 1 << 26).start();
	}

	public void run() {

		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		pr.println(n ^ 1);
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
