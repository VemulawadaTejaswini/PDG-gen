import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) {
		 FastScanner sc =new FastScanner();
		 int n=1000005;
		 BigInteger [] a=new BigInteger[n];
		 String s="";
		 for(int i=0;i<n;i++) {
			 s+="7";
			 a[i]=new BigInteger(s);
		 }
		 
		 
		  long k=sc.nextLong();
		  BigInteger b1=BigInteger.valueOf(k);
		  boolean b=false;
		  int i;
		  for(i=0;i<n;i++) {
			  if(a[i].mod(b1).compareTo(new BigInteger("0"))==0) {
				  b=true;
				  break;
			  }
		  }
		  if(b) System.out.println(i+1);
		  else System.out.println("-1");
		 
		  
		
		    	
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