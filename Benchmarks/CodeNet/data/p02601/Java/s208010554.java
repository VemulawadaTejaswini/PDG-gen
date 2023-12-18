import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Main {
	static class InputReader{ 
	BufferedReader reader;
	StringTokenizer tokenizer;
	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}
	String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
	public Long nextLong() {
		return Long.parseLong(next());
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	}
	static InputReader r = new InputReader(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Solve();
		pw.close();
	}
	static class Solve {
		Solve() {// if b > a || c > b
			int a = r.nextInt(), b = r.nextInt(), c = r.nextInt(), k = r.nextInt();
			boolean work = false;
			while (k > 0 && b <= a) {
				if (b <= a && k > 0) {
					b *= 2;
					k = k - 1;
				} else {
					break;
				}
			}
			while (k > 0 && c <= b) {
				if (k > 0 && c <= b) {
					c*=2;
					k = k - 1;
				}
			}
			if (c > b && b > a) {
				work = true;
			}
			if (work) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
			return;
		}
	}
}
