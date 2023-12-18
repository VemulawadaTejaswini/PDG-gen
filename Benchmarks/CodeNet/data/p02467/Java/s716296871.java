import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		FastScanner scanner = new FastScanner(System.in);
		int n = (int) scanner.nextInt();
		StringBuffer str = new StringBuffer();
		str.append(n +":");
		for (int i = 2; i * i <= n; i++) {
			while (n%i==0) {
				n = n/i;
				str.append(" "+ i);
			}
		}
		if (n>1) {
			str.append(" "+ n);
		}
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.printf("%s\n", str.toString());
		printWriter.close();
	}

	static class FastScanner {
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


		public long nextInt() {
			return Integer.parseInt(next());
		}

	
	}
}