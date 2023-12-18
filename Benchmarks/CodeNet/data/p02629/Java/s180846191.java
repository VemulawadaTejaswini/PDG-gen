import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		long N = sc.nextLong();
		String anser = "";
		while (true) {
			N--;
			anser = (char)(N % 26 + 'a') + anser;
			N = N / 26;
			if (N == 0) {
				break;
			}
		}
		System.out.println(anser);
	}

	private static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

//		public int nextInt() {
//			return Integer.parseInt(next());
//		}

		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}