import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
		char[][] a = new char[h][w];
		for(int i = 0; i < h; i++) {
			char[] s = sc.next().toCharArray();
			a[i] = s;
		}
		int[][] s = set(h, w);
		int ans = 0;
		for(int i = 0; i < (int)Math.pow(2, h+w); i++) {
			int[] c =  s[i];
			int num = 0;
			for(int j = 0; j < h; j++) {
				if(c[j] == 0) {
					for(int l = 0; l < w; l++) {
						if(a[j][l] == '#' && c[h+l] == 0) {
							num++;
						}
					}
				}
			}
			if(num == k) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	static int[][] set(int h, int w) {
		int all = (int)Math.pow(2, h+w);
		int[][] list = new int[all][h+w];
		for(int i = 0; i < all; i++) {
			Arrays.fill(list[i], 0);
			int x = i;
			int n = 0;
			while(x >= 2) {
				list[i][n] = x % 2;
				n++;
				x /= 2;
			}
			list[i][n] = x;
		}
		return list;
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
