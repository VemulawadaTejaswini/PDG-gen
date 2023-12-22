import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] vals = new int[N];
		for (int i = 0; i < N; i++) {
			vals[i] = sc.nextInt();
		}
		int ans = -1000;
		for (int i = 0; ans == -1000; i++) {
			for (int j = -1; j <= 1 && ans == -1000; j+=2) {
				int val = X + i * j;
				boolean can = true;
				for (int k = 0; k < N; k++) {
					if (vals[k] == val) {
						can = false;
						break;
					}
				}
				if (can) {
					ans = val;
				}
			}
		}
		out.println(ans);
		
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
