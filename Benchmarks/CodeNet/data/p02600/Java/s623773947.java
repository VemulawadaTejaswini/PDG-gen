import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int X = sc.nextInt();
		int ans = 0;

		if (X >= 400 && X <= 599) {
			ans = 8;
		}
		else if (X >= 600 && X <= 799) {
			ans = 7;
		}
		else if (X >= 800 && X <= 999) {
			ans = 6;
		}
		else if (X >= 1000 && X <= 1199) {
			ans = 5;

		}
		else if (X >= 1200 && X <= 1399) {
			ans = 4;

		}
		else if (X >= 1400 && X <= 1599) {
			ans = 3;

		}
		else if (X >= 1600 && X <= 1799) {
			ans = 2;

		}
		else if (X >= 1800 && X <= 1999) {
			ans = 1;

		}
		System.out.println(ans);
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
