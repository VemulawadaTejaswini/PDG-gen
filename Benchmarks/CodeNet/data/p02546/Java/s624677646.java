import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) {
		FastScanner in=new FastScanner();
		StringBuilder sb=new StringBuilder(in.next());
		int n=sb.length();
		if(sb.charAt(n-1)=='s') {
			sb.append('e');
		}
		sb.append('s');
		System.out.println(new String(sb));
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
