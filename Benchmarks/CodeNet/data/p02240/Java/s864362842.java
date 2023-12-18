import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int m = in.nextInt();
			int[] d = new int[n+1];

			List<List<Integer>> con = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				con.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < m; i++) {
				int v1 = in.nextInt();
				int v2 = in.nextInt();

				con.get(v1).add(v2);
				con.get(v2).add(v1);
			}

			int q = in.nextInt();
			for (int i = 0; i < q; i++) {
				Arrays.fill(d, -1);
				int from = in.nextInt();
				int to = in.nextInt();
				if (GraphUtils.dfs(con, d, from, to)) {
					out.println("yes");
				} else {
					out.println("no");
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

	static class GraphUtils {
		public static boolean dfs(List<List<Integer>> list, int[] d, int index, int ser) {
			boolean flg = false;
			List<Integer> l = list.get(index);
			d[index] = 1;
			for (int i = 0; i < l.size() && !flg; i++) {
				int num = l.get(i);
				if (d[num] != -1) {
					continue;
				}
				d[num] = 1;
				if (num == ser) {
					return true;
				}
				flg = dfs(list, d, num, ser);
			}
			return flg;
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

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

