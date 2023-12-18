import java.io.*;
import java.util.*;

public class five {
	static class InputReader {
		BufferedReader reader;
		StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens())
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		InputReader f = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 1; i <= 5; i++) {
			if (f.nextInt() == 0) {
				System.out.println(i);
				break;
			}
		}
		
		f.close();
		out.close();
	}
}