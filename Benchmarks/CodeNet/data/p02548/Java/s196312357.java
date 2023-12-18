import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) {
		FastScanner in=new FastScanner();
		long n=in.nextInt();
		long ans=0;
		for(int a=1;a<n;a++) {
			long low=1, high=n-1;
			long b=1;
			while(low<high-1) {
				long mid=low+(high-low)/2;
				if(a*mid<n) {
					low=mid;
					b=mid;
				}
				else
					high=mid;
			}
//			System.out.println(b*a);
			b=low;
			ans=ans+b;
		}
//		ans=2*ans;
			
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
