import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) {
		FastScanner in = new FastScanner();
		long a=in.nextInt();
		long b=in.nextInt();
		long c=in.nextInt();
		long d=in.nextInt();
		System.out.println(Math.max(Math.max(a*c, b*d), Math.max(a*d, b*c)));
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
