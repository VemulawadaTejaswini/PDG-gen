import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		new Solution().solve(in, out);
		out.close();
	}
	
	static class Solution {
		private long nextLong(InputReader in) {
			return Long.parseLong(in.next());
		}
		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			long ans = 1;
			for (int i = 0; i < n; ++i) {
				ans = ans * nextLong(in);
			}
			Long value = new Long((long) 1e18);
			if (ans <= value) {
				out.println(ans);
				return;
			}
			out.println(-1);
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException();
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
