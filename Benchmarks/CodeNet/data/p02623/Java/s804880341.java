import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		int ans = 0;
		int N = input.nextInt();
		int M = input.nextInt();
		long K = input.nextLong();
		long[] PN = new long[N+1];
		long[] PM = new long[M+1]; //Prefix sums
		for (int i = 0; i < N; i++) {
			PN[i+1]=PN[i];
			PN[i+1]+=input.nextLong();
		}
		for (int i = 0; i < M; i++) {
			PM[i+1]=PN[i];
			PM[i+1]+=input.nextLong();
		}
		for (int a = 0; a <= N; a++) {
			if (PN[a]>K) break;
			for (int b = 0; b <= M; b++) {
				if (PN[a]+PM[b]<=K) {
					ans=Math.max(ans, a+b);
				}else break;
			}
		}
		w.println(ans);
		w.flush();
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
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

