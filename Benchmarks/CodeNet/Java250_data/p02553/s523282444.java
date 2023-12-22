import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	private static final FastIn in = new FastIn();
	private static final PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		Solver sol = new Solver();
		sol.solve();
		out.close();
	}
	private static final class Solver {
		public void solve() {
			long[] a = new long[2];
			long[] b = new long[2];
			for (int i = 0; i < 2; ++i) a[i] = in.nextInt();
			for (int i = 0; i < 2; ++i) b[i] = in.nextInt();
			long ans = Long.MIN_VALUE;
			for (int i = 0; i < 2; ++i)
				for (int j = 0; j < 2; ++j) {
					ans = Math.max(ans, a[i] * b[j]);
				}
			out.println(ans);
		}
	}
	private static final class FastIn {
		private BufferedReader br;
		private StringTokenizer st;
		public FastIn() {
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
			st = null;
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}