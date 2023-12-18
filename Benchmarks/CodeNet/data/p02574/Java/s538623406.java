import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static long m=(long)1e9+7;
	public static long mod(long a) {
		return (a%m+m)%m;
		
	}
	public static long add(long a,long b) {
		return mod(mod(a)+mod(b));
		
	}
	public static long mul(long a,long b) {
		return mod(mod(a)*mod(b));
		
	}
	public static int gcd(int a,int b) {
		if(a==0) return b;
		return gcd(b%a, a);
		
	}
	
	
	public static boolean coprime(int a[],int n) {
		int max=Arrays.stream(a).max().getAsInt();
		int div[]=new int[max+1];
		
		for(int i=0;i<n;i++) {
			for(int j=2;j*j<=a[i];j++) {
				if(a[i]%j==0) {
					div[j]++;
					if(j!=a[i]/j) div[a[i]/j]++;
					if(div[j]>1||div[a[i]/j]>1) return false;
					
				}
				
			}
		}
		
		return true;
		
	}
	public static boolean setPrime(int a[],int n) {
		int ans=0;
		for(int i:a) ans=gcd(ans, i);
		
		return ans==1;
		
	}
	public static void main(String []args) {
		
		FastScanner scanner=new FastScanner();
		int n=scanner.nextInt();
		int a[]=scanner.readArray(n);
		if(coprime(a, n)) System.out.println("pairwise coprime");
		else if(setPrime(a, n)) System.out.println("setwise coprime");
		else System.out.println("not coprime");
		
	}
	  

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}