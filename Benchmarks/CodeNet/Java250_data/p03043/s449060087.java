import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A = 0;
		long B = 0;

		BigDecimal n = new BigDecimal(N);
		BigDecimal p = new BigDecimal("0");

		for (int i=1;i<=N;i++) {
			int score = i;
			int num = 0;
			while(score < K) {
				score *= 2;
				num++;
			}
			if (i == 1) {
				A = (long) (Math.pow(2, num) * N);
			}
			B += A / (long) (Math.pow(2, num) * N);



//			p = p.add(new BigDecimal(1).divide( new BigDecimal(Math.pow(2, num)) ).divide(n, RoundingMode.HALF_EVEN));
		}
		p = new BigDecimal(B).divide(new BigDecimal(A),15, RoundingMode.HALF_UP);
		System.out.println(p);
	}

}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
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

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
     }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}