import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		BigDecimal result = BigDecimal.valueOf(1L);
		long n = sc.nextLong();

		for (long i = 0; i < n; i++) {
			String next = sc.next();
			if ("0".equals(next)) {
				result = BigDecimal.ZERO;
				break;
			}

			result = result.multiply(new BigDecimal(next));
		}
		if (!BigDecimal.ZERO.equals(result)) {
			BigDecimal max = BigDecimal.valueOf(10L).pow(18);
			if (max.compareTo(result) < 0) {
				result = BigDecimal.valueOf(-1L);
			}
		}
		System.out.println(result.toString());
	}
}

class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public long nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
