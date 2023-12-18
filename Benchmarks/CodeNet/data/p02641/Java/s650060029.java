import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solution sol = new Solution();
		sol.solve(in, out);
		out.close();
	}

	private static class Solution {
		final int[] arr = new int[110];
		private void solve(InputReader in, PrintWriter out) {
			int x = in.ni();
	        int n = in.ni();
	        for (int i = 0; i < n; i++) arr[i] = in.ni();
	        int ans = 0;
	        for (int i = 1; i < 101; i++) {
	        	boolean exists = false;
	        	for (int val : arr) if (i == val) {
	        		exists = true;
	        		break;
	        	}
	        	if (exists) continue;
	        	if (Math.abs(i - x) < Math.abs(ans - x)) ans = i;
	        }
	        out.println(ans);
		}
	}

	private static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		private InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		private String n() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		private int ni() {
			return Integer.parseInt(n());
		}
	}

}
