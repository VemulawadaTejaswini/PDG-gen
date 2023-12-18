import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long k = sc.nextLong();
		ArrayList<Long> a = new ArrayList<>();
		ArrayList<Long> b = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a.add(sc.nextLong());
		}
		for(int i = 0; i < m; i++) {
			b.add(sc.nextLong());
		}
		long mi = 0l;
		long ans = 0l;
		while(mi <= k) {
			if(a.size() != 0) {
				if(b.size() != 0) {
					if(a.get(0) > b.get(0)) {
						mi += b.get(0);
						b.remove(0);
					}else {
						mi += a.get(0);
						a.remove(0);
					}
				}else {
					mi += a.get(0);
					a.remove(0);
				}
			}else{
				if(b.size() != 0) {
					mi += b.get(0);
					b.remove(0);
				}else {
					break;
				}
			}
			ans++;
		}
		
		if(mi > k) ans--;
		System.out.println(ans);
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
