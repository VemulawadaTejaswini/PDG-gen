
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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

	static int town = 10;
	static int path = 46;
	static int INF = 1<<29;
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = 0;
			while ((n = in.nextInt()) != 0) {

				int[][] d = new int[town][town];
				for (int i = 0; i < d.length; i++) {
					Arrays.fill(d[i], INF);
				}
				for (int i = 0; i < d.length; i++) {
					d[i][i] = 0;
				}
				for (int i = 0; i < n; i++) {
					int a = in.nextInt();
					int b = in.nextInt();
					int c = in.nextInt();
					d[a][b] = c;
					d[b][a] = c;
				}

				warshallFloyd(d);

				int[] ans = new int[town];
				for (int i = 0; i < d.length; i++) {
					for (int j = 0; j < d.length; j++) {
						if (d[i][j] != INF) {
							ans[i] += d[i][j];
						}
					}
				}

				int cost = 1 << 29;
				int tt = -1;
				for (int i = 0; i < ans.length; i++) {
					if (ans[i] != 0 && ans[i] < cost) {
						cost = ans[i];
						tt = i;
					}
				}

				out.println(tt + " " + cost);
			}

		}

		void warshallFloyd(int[][] d) {
			int n = d.length;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
					}
				}
			}
		}
	}


	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
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

