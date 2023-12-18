import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] vals = new int[N];
		for (int i = 0; i < N; i++) {
			vals[i] = sc.nextInt();
		}
		all = new int[2 * N];
		while (K > 0) {
			int[] tmp = make(vals);
			if (Arrays.equals(tmp, vals)) break;
			vals = tmp;
			K--;
		}
		for (int i = 0; i < N; i++) {
			out.print(vals[i] + " ");
		}
		out.println();

		out.flush();
	}

	static int[] all;
	static int[] make(int[] vals) {
		int idx = 0;
		for (int i = 0; i < vals.length; i++) {
			all[idx++] = 2 * (i - vals[i]);
			all[idx++] = 2 * (i + vals[i]) + 1;
		}
		Arrays.sort(all);
		int[] ret = new int[vals.length];
		idx = 0;
		int got = 0;
		for (int i = 0; i < ret.length; i++) {
			int target = 2 * i;
			while (idx < all.length && all[idx] <= target) {
				if ((all[idx] & 1) == 0) got++;
				else got--;
				idx++;
			}
			ret[i] = got;
		}
		return ret;
	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
