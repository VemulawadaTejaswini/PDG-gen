import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException,NumberFormatException{
		try {
		   FastScanner sc=new FastScanner();
		   long n=sc.nextLong(),d=sc.nextLong();
		   d*=d;
		   int count=0;
		   for(int i=0;i<n;i++) {
			   long x=sc.nextLong(),y=sc.nextLong();
			   if((x*x)+(y*y)<=d) {
				   count++;
			   }
		   }
		   System.out.println(count);
		}
		catch(Exception e) {
			return ;
		}

	}
	public static boolean isDigit(long n) {
		int count9=0;
		while(n!=0) {
			long temp=n%10;
			if(temp==0)
				return false;
			if(temp==9)
				count9++;
			n/=10;
		}
		if(count9>=1) {
			return true;
		}
		return false;
	}
	public static long prod(long n) {
		long prod=1;
		while(n!=0) {
			prod=prod*(n%10);
			n/=10;
		}
		return prod;
	}
	
	public static long LCM(long a,long b) {
			return (a*b)/GCD(a,b);
	}
	public static long GCD(long a,long b) {
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
    
	public static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                                      st=new StringTokenizer(br.readLine());				               
                              } catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		
	}
}
