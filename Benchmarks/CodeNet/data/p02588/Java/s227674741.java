import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long[] num = new long[N], den = new long[N];
		for (int i = 0; i < N; i++) {
			String val = sc.next();
			String dec = "0";
			int pos = val.indexOf('.');
			if (pos != -1) {
				dec = val.substring(pos + 1);
				val = val.substring(0, pos);
			}
			num[i] = Long.parseLong(val);
			den[i] = 1;
			char[] ff = dec.toCharArray();
			for (int j = 0; j < ff.length; j++) {
				num[i] *= 10;
				num[i] += ff[j] - '0';
				den[i] *= 10;
			}
			long gcd = gcd(num[i], den[i]);
			num[i] /= gcd;
			den[i] /= gcd;
		}
		int MINUS = 10;
		long[][] count = new long[60][60];
		for (int i = 0; i < N; i++) {
			int two = get(num[i], 2) - get(den[i], 2);
			int five = get(num[i], 5) - get(den[i], 5);
			count[two + MINUS][five + MINUS]++;
		}
		long ans = 0;
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 60; j++) if (i + j - 2 * MINUS >= 0) {
				for (int k = 0; k < 60; k++) {
					for (int l = 0; l < 60; l++) if (k + l - 2 * MINUS >= 0) {
						ans += count[i][k] * count[j][l];
					}
				}
			}
		}
		long tmp = 0, plus = 0;
		for (int i = MINUS; i < 60; i++) {
			for (int j = MINUS; j < 60; j++) {
				tmp += count[i][j] * count[i][j];
				plus += count[i][j] * (count[i][j] - 1) / 2;
			}
		}
		ans -= tmp;
		ans /= 2;
		ans += plus;
		out.println(ans);
		
		out.flush();
	}

	static int get(long val, int factor) {
		int ret = 0;
		while (val % factor == 0) {
			val /= factor;
			ret++;
		}
		return ret;
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
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
