import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		long maxxi_y1 = Integer.MIN_VALUE;
		long minxi_y1 = Integer.MAX_VALUE;
		long maxxi_plus_y1 = Integer.MIN_VALUE;
		long minxi_plus_y1 = Integer.MAX_VALUE;
		long x[][] = new long[n][2];
		for(int i =0;i<n;i++) {
			x[i][0] = sc.nextLong();
			x[i][1] = sc.nextLong();
			maxxi_y1 = Math.max(maxxi_y1, x[i][0]-x[i][1]);
			maxxi_plus_y1 = Math.max(maxxi_plus_y1, x[i][0]+x[i][1]);
			minxi_plus_y1 = Math.min(minxi_plus_y1, x[i][0]+x[i][1]);
			minxi_y1 = Math.min(minxi_y1, x[i][0]-x[i][1]);
		}
		long ans =0;
		
			ans  = Math.max( (maxxi_plus_y1-minxi_plus_y1), (maxxi_y1 - minxi_y1) );
			System.out.println(ans);
		
	}
	
	
	static final Random random = new Random();
	
	static void sort(int[] a) {
		int n = a.length;
		for(int i =0; i<n; i++) {
			int val = random.nextInt(n);
			int cur = a[i];
			a[i] = a[val];
			a[val] = cur;
		}
		Arrays.sort(a);
	}
	
	static void sortl(long[] a) {
		int n = a.length;
		for(int i =0; i<n; i++) {
			int val = random.nextInt(n);
			long cur = a[i];
			a[i] = a[val];
			a[val] = cur;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (st == null  || !st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		String nextLine() { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
		} 
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
	}

}
