
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;



 class Main{
	 
	 
	 
	

	public static void main(String[] args) throws IOException {
		
		
		FastScanner sc=new FastScanner();
		
		int n = sc.nextInt();
		long hi[] = new long[n+1];
		for(int i=0; i<n; i++)
			hi[i+1] = sc.nextLong();
		long dp[] = new long[n+1];
		
		dp[1] = 0;
		dp[2] = Math.abs(hi[1]-hi[2]);
		
		for(int i=3; i<n+1; i++) {
			dp[i] = Math.min(dp[i-2] + Math.abs(-hi[i]+hi[i-2]), dp[i-1] +Math.abs(-hi[i]+hi[i-1]));
		}
		
		System.out.println(dp[n]);
		
				
	}
	
	
	
	
 
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long[] readArrayLong(int n) {
        	long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
        }
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
	}
}
