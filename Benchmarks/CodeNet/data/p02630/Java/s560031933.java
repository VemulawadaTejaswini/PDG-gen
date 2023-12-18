import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		long ans = 0l;
		for(; n>0; n--) {
			int x = sc.nextInt();
			ans += x;
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}else {
				map.put(x, 1);
			}
		}
		int q = sc.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		for(; q > 0; q--) {
			int b = sc.nextInt(), c = sc.nextInt();
			if(map.containsKey(b)) {
				ans += map.get(b)*(c-b);
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+map.get(b));
				}else {
					map.put(c, map.get(b));
				}
				map.remove(b);
			}
			list.add(ans);
		}
		for(long l : list) {
			System.out.println(l);
		}
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
