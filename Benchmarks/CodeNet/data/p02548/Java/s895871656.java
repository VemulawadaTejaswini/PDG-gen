import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) {
		FastScanner in=new FastScanner();
		int n=in.nextInt();
		int ans=0;
		for(int i=1;i<n-1;i++) {
			int val=n-i;
			for(int j=1;j<Math.sqrt(val);j++) {
				if(val%j==0)
					ans=ans+2;
			}
			if(val%Math.sqrt(val)==0)
				ans++;
		}
		System.out.println(ans+1);
	}

	///////////////////////////
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

		int[] nextArray(int n) {
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
