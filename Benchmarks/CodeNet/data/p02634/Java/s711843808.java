import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static final int MOD = 998244353;
	static int A, B;
	
	static int[][] table;
	
	static int calc(int a, int b) {
		int ret = table[a][b];
		if (ret != -1) return ret;
		if (a == A && b == B) return table[a][b] = 1;
		long tmp  = 0;
		if (a > A) {
			tmp += b * (long)calc(a - 1, b);
			tmp %= MOD;
		}
		if (b > B) {
			tmp += a * (long)calc(a , b - 1);
			tmp %= MOD;
		}
		if (a > A && b > B) {
			tmp -= (a - 1) * (b - 1) * (long) calc(a-1, b-1);
			tmp %= MOD;
			tmp += MOD;
			tmp %= MOD;
		}
		return table[a][b] = (int) tmp;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		A = sc.nextInt();
		B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		table = new int[C + 1][D + 1];
		for (int i = 0; i <= C; i++) {
			Arrays.fill(table[i], -1);
		}
		out.println(calc(C, D));
		
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
