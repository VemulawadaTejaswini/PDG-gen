import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long[] vals = new long[N+1];
		for (int i = 0; i < N + 1; i++) {
			vals[i] = sc.nextLong();
		}
		boolean can = true;
		long ans = 0;
		long[] cant = new long[N + 2];
		cant[0] = 1;
		long totSum = 1;
		int from = 0, to = 1;
		for (int i = 0; i < N + 1 && can; i++) {
			while (vals[i] > 0 && from < to) {
				long min = Math.min(vals[i], cant[from]);
				ans += min * (to - from);
				vals[i] -= min;
				cant[from] -= min;
				totSum -= min;
				if (vals[i] == 0) from++;
			}
			if (vals[i] > 0) can = false;
			cant[to++] = totSum;
			totSum *= 2;
			totSum = Math.min(totSum, Long.MAX_VALUE / 4);
		}
		out.println(can ? ans : -1);
		
		out.flush();
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
