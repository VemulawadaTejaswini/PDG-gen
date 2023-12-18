import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		String str = sc.next();

		int rain = 0;
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (str.charAt(i)=='R') {
				count++;
			}
			else {
				if (count > rain) {
					rain = count;
				}
				count=0;
			}
		}
		if (count > rain) {
			rain = count;
		}
		System.out.println(rain);
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

	}
}
