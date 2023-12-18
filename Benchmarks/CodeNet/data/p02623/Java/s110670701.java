import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long k = sc.nextLong();
		
		long[] as = new long[n];
		long[] bs = new long[m];
		
		long am = -1l, bm = -1l, ac = 0l, bc = 0l, total = 0l;
		for(int i = 0; i < n; i++) {
			long x = sc.nextLong();
			as[i] = x;
			ac += x;
			if(ac <= k) {
				am = i;
				total += x;
			}
		}
		
		for(int i = 0; i < m; i++) {
			long x = sc.nextLong();
			bs[i] = x;
			bc += x;
			if(bc <= k) {
				bm = i;
				total +=x;
			}
		}
		
		long an = am + bm + 2;
		long h = 0l;
		while(total > k) {
			if(as[(int)am] < bs[(int)bm]) {
				total -= bs[(int)bm];
				bm--;
				if(h != 0) {
					am += h;
					h = 0;
				}
			}else if(as[(int)am] > bs[(int)bm]) {
				total -= as[(int)am];
				am--;
				if(h != 0) {
					bm += h;
					h = 0;
				}
			}else{
				h++;
				am--;
				bm--;
			}
			an--;
		}
		System.out.println(an);
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
