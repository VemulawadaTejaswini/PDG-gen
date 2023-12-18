import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solution sol = new Solution();
		sol.solve(in, out);
		out.close();
	}

	static int MAX = 1000001;

	static class Query {
		int l, r, idx;

		public Query(int l, int r, int idx) {
			this.l = l;
			this.r = r;
			this.idx = idx;
		}
		static void update(int idx, int val, int bit[], int n) {
			for (; idx <= n; idx += idx & -idx)
				bit[idx] += val;
		}
		
		static int query(int idx, int bit[], int n) {
			int sum = 0;
			for (; idx > 0; idx -= idx & -idx)
				sum += bit[idx];
			return sum;
		}
	}

	private static class Solution {
		private void solve(InputReader in, PrintWriter out) {
			int n = in.ni(), q = in.ni();
			int[] colors = in.readArray(n);
			Query[] qs = new Query[q];
			for (int i = 0; i < q; ++i)
				qs[i] = new Query(in.ni() - 1, in.ni() - 1, i);
			Arrays.sort(qs, (x, y) -> {
				if (x.r < y.r)
					return -1;
				else if (x.r == y.r)
					return 0;
				else
					return 1;
			});
			int[] bit = new int[n + 1];
			Arrays.fill(bit, 0);
			int[] last_visit = new int[MAX];
			Arrays.fill(last_visit, -1);
			int[] ans = new int[q];
			int query_counter = 0;
			for (int i = 0; i < n; i++) {
				if (last_visit[colors[i]] != -1)
					Query.update(last_visit[colors[i]] + 1, -1, bit, n);
				last_visit[colors[i]] = i;
				Query.update(i + 1, 1, bit, n);
				while (query_counter < q && qs[query_counter].r == i) {
					ans[qs[query_counter].idx] = Query.query(qs[query_counter].r + 1, bit, n)
							- Query.query(qs[query_counter].l, bit, n);
					query_counter++;
				}
			}

			for (int i = 0; i < q; i++)
				out.println(ans[i]);
		}
	}

	private static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		private InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		private String n() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		private int ni() {
			return Integer.parseInt(n());
		}

		private int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = ni();
			return a;
		}
	}
}