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
		new Solution().solve(in, out);
		out.close();
	}

	static class Solution {
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			for (int i = 0; i < n; ++i) {
				a[i] = nextLong(in);
				b[i] = nextLong(in);
			}
			if (n % 2 == 1) {
				Arrays.sort(a);
				Arrays.sort(b);
				out.println(b[n / 2] - a[n / 2] + 1);
			} else {
				Arrays.sort(a);
				Arrays.sort(b);
				out.println((b[n / 2] + b[n / 2 - 1]) - (a[n / 2] + a[n / 2 - 1]) + 1);
			}
		}

		private long nextLong(InputReader in) {
			return Long.parseLong(in.next());
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
