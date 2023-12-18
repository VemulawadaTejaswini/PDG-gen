
// Submitted by Subhash
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;



import java.util.*;

public class Main {


	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n=sc.nextInt();
		int a []=sc.readArray(n);
		Arrays.sort(a);
		int ans=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
			
			if(a[i]+a[j]>a[k]&&a[i]!=a[j]&&a[j]!=a[k]) {
				ans++;
			}
			
			
		}
System.out.println(ans);
	

		

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