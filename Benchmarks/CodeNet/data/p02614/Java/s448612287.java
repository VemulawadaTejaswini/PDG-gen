import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
		char[][] a = new char[h][w];
		for(int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}
		int[][] b = list(h,w);
		int ans = 0;
		for(int i = 0; i < (int)Math.pow(2, h+w); i++) {
			int[] wi = b[i];
			int nk = 0;
			for(int j = 0; j < h; j++) {
				if(wi[j] == 0) {
					for(int l = h; l < h+w; l++) {
						if(wi[l] == 0 && a[j][l-h] == '#') {
							nk++;
						}
					}
				}
				
			}
			if(nk == k) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	static int[][] list(int h, int w) {
		int all = (int)Math.pow(2, h+w);
		int[][] li = new int[all][h+w];
		for(int i = 0; i < all; i++) {
			int x = i;
			int p = 0;
			while(x >= 2) {
				li[i][p] = x%2;
				x /= 2;
				p++;
			}
			li[i][p] = x;
		}
		return li;
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
