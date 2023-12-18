import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static long[] set;
	static int size;
	
	static void add(long val) {
		long me = Long.highestOneBit(val);
		for (int i = size - 1; i >= 0; i--) {
			long bit = Long.highestOneBit(set[i]);
			if (me == bit) {
				val ^= set[i];
				me = Long.highestOneBit(val);
			}
		}
		if (val != 0) {
			set[size++] = val;
			Arrays.sort(set, 0, size);
		}
	}
	
	static boolean canRemove(long val) {
		long me = Long.highestOneBit(val);
		for (int i = size - 1; i >= 0; i--) {
			long bit = Long.highestOneBit(set[i]);
			if (me == bit) {
				val ^= set[i];
				if (val == 0) {
					return true;
				}
				me = Long.highestOneBit(val);
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = sc.nextInt();
		set = new long[70];
		for (int caze = 0; caze < T; caze++) {
			int N = sc.nextInt();
			long[] vals = new long[N];
			for (int i = 0; i < N; i++) {
				vals[i] = sc.nextLong();
			}
			char[] S = sc.next().toCharArray();
			size = 0;
			
			boolean zero = true;
			for (int i = N - 1; i >= 0; i--) {
				if (S[i] == '0') {
					add(vals[i]);
				} else {
					if (!canRemove(vals[i])) {
						zero = false;
					}
				}
			}
			out.println(zero ? 0 : 1);
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
