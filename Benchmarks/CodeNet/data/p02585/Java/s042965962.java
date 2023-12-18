import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long[] p = new long[n];
		long[] c = new long[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextLong();
		}
		long ans = Long.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			long s = score(i, p, c, k);
			if(ans < s) {
				ans = s;
			}
		}
		System.out.println(ans);
	}

	static Long score(int start, long[] p, long[] c, int k) {
		long s = 0, max = Long.MIN_VALUE;
		long x = p[start]-1;
		long pl = start;
		for(int i = 0; i < k; i++) {
			x = p[(int)pl]-1;
			s += c[(int)x];
			pl = p[(int)pl] - 1;
			if(max < s) {
				max = s;
			}
		}
		return max;
	}

	static class FastScanner {
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
}
