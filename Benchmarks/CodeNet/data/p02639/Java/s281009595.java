import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int[] numbers = {0,0,0,0,0};
		for (int i= 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			if (numbers[i]==0) {
				System.out.println(i+1);
			}
		}
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