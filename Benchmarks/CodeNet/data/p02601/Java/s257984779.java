import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int A = sc.nextInt(); // Red
		int B = sc.nextInt(); // Green
		int C = sc.nextInt(); // Blue

		int K = sc.nextInt();

		for (int i=0; i < K; i++) {
			if (A >= B) {
				B = B * 2;
			}
			else if (B >= C) {
				C = C * 2;
			}
		}


		if (check(A, B, C)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	private static boolean check(int red, int green, int blue) {
		//System.out.println("red="+red+",green="+green+"blue="+blue);

		if (red < green && green < blue) {
			//System.out.println("true");
			return true;
		}
		//System.out.println("false");
		return false;
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
