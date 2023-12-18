import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) {
		 FastScanner sc =new FastScanner();
		 int n=10000007;
		 
		 long k=sc.nextLong();
		long val=7%k;
		 for(int i=1;i<=n;i++) {
			
			 if(val==0) {
				 System.out.println(i);
				 return;
			 }
			 val=(val*10+7)%k;
		 }
		 
		
		   System.out.println("-1");
		 
		  
		
		
		    	
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
		long nextLong() {
			return Long.parseLong(next());
		}
}

		    
		}