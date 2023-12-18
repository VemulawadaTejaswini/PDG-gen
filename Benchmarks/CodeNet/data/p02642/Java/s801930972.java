import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static final int MAX = 1000001;
	static int[] cant;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		cant = new int[MAX];
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			cant[tmp]++;
		}
		int ans = 0;
		for (int i = 1; i < MAX; i++) if (cant[i] == 1) {
			boolean can = cant[1] == 0;
			for (int div = 2; div * div <= i && can; div++) {
				if (i % div == 0 && (cant[div] > 0 || cant[i / div] > 0)) {
					can = false;
					break;
				}
			}
			if (can) ans++;
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
