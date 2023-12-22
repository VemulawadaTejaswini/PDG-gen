import java.util.*;
import java.io.*;
import java.math.BigDecimal;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int L = fs.nextInt();
		double y = (double)L/3;
		BigDecimal x = BigDecimal.valueOf(y);
		BigDecimal ans = x.multiply(x);
		 ans = ans.multiply(x);

		 System.out.printf("%.12f", ans);
 
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}
