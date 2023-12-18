import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

import static java.lang.System.exit;

public class Main {
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		boolean flag=true;
		int a[]=sc.readArray(n); Arrays.sort(a);
		for (int i = 0; i < n;  i++) {
			for (int j = i+1; j < n; j++) {
				if(gcd(a[j],a[i])!=1) { flag=false; break;}
			}
		}
		if(flag) { System.out.println("pairwise coprime"); exit(0);}
		if(findGCD(a,n)==1) { System.out.println("setwise coprime"); flag=true; exit(0);}
		System.out.println("not coprime");
	}
	static int gcd(int a,int b)
	{
		if(b==0) return a;
		else return gcd(b,a%b);
	}
	static int findGCD(int arr[], int n)
	{
		int result = 0;
		for (int element: arr){
			result = gcd(result, element);

			if(result == 1)
			{
				return 1;
			}
		}

		return result;
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