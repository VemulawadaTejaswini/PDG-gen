import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	static long A, B, C, D;
	static Map<Long, Long> memo;
	
	static long calc(long n) {
		Long ret = memo.get(n);
		if (ret != null) return ret;
		if (n == 1) return D;
		if (n == 0) return 0;
		long tmp = Long.MAX_VALUE;
		if (tmp / n > D) {
			tmp = n * D;
		}
		for (int i = -2; i <= 2; i++) {
			if (Math.abs(i) <= 1 && (n + i) % 2 == 0 && n + i != 0) {
				tmp = Math.min(tmp, A + Math.abs(i) * D + calc((n + i) / 2));
			}
			if (Math.abs(i) <= 1 && (n + i) % 3 == 0 && n + i != 0) {
				tmp = Math.min(tmp, B + Math.abs(i) * D + calc((n + i) / 3));
			}
			if ((n + i) % 5 == 0 && n + i != 0) {
				tmp = Math.min(tmp, C + Math.abs(i) * D + calc((n + i) / 5));
			}
		}
		memo.put(n, tmp);
		return tmp;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			memo = new HashMap<>();
			long N = sc.nextLong();
			A = sc.nextLong();
			B = sc.nextLong();
			C = sc.nextLong();
			D = sc.nextLong();
			out.println(calc(N));
		}
		
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
