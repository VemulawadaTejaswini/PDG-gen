
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static int N, W;
	static int[] vn, wn;
	static Map<Long, Long> memo = new HashMap<>();

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			N = in.nextInt();
			W = in.nextInt();

			vn = new int[N];
			wn = new int[N];

			for (int i = 0; i < N; i++) {
				int v = in.nextInt(), w = in.nextInt();
				vn[i] = v;
				wn[i] = w;
			}

			out.println(rec(0, 0));

		}
		static long rec(int i, int totalW) {
			long key = (long)i << 32 | totalW;
			if (i == N) {
				memo.put(key, 0L);
				return 0;
			}
			if (memo.containsKey(key)) {
				return memo.get(key);
			}
			long ret = 0;
			if (totalW+wn[i] <= W) {
				ret = Math.max(rec(i+1, totalW), rec(i+1, totalW+wn[i])+vn[i]);
			} else {
				ret = rec(i+1, totalW);
			}

			memo.put(key, ret);
			return ret;

		}

	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

