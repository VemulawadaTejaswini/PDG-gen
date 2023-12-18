import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
	
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		String st = fs.next();
		int ans = solve(st);
		System.out.println(ans);
		
		
	}
	
	static int solve(String st, int m) {
		
		int count = 0;
		while(st.contains("WR")) {
		}
		
		return 0;
	}
	
	static int solve(String s) {
			int wrCount = 0;int rrcount = 0;
			int ans = 0;
		 char[] arr = s.toCharArray();
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]=='W' && arr[i+1]=='R') {
				 wrCount++;
			 }
			 if(arr[i]=='R'&&arr[i+1]=='R') {
				 rrcount++;
			 }
		 }
		 if(wrCount==1||wrCount==2) {
			 ans++;
		 }else {
			 ans += wrCount-1;
		 }
		 ans += rrcount;
		 if(wrCount==0) {
			 ans=0;
		 }
		
		return ans;
	}
	
	void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
	}
 
}



