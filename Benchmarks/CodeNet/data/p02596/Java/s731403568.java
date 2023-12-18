import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		long K = sc.nextLong();
		String strK = Long.toString(K);

		long ans = -1;
		if (K % 2 != 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < strK.length(); i++) {
				sb.append("7");
			}

			//System.out.println("first ="+sb.toString());

			for (int i = strK.length(); ; i++) {
				sb.append("7");
				long x = Long.parseLong(sb.toString());

				if (x % K == 0) {
					ans = i;
					break;
				}
			}
		}

		System.out.println(ans);

	}

	private static long checkValue(long x) {
		System.out.println("x="+x);
		String str = Long.toString(x);
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) != '7') {
				return -1;
			}
		}
		return str.length();
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

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}
