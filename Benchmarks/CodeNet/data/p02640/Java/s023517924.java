import java.io.*;
import java.util.*;

public class cranes {
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
		
		int X = f.nextInt(), Y = f.nextInt();
		
		int z = Y - 2 * X;
		System.out.println((z >= 0 && (z) % 2 == 0 && z <= X) ? "YES" : "NO");
		
		f.close();
		out.close();
	}
}