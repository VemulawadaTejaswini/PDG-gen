

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		long prod = 1L, max = (long)Math.pow(10, 18);
		boolean flag = false;
		
		long ar[] = new long[n];
		
		for(int i = 0; i < n; i++)
			ar[i] = sc.nextLong();

		for (int i = 0; i < n; i++) {

			long a = ar[i];
			
			if(a == 0) {
				
				prod = 0;
				flag = false;
				break;
			}

			if (prod * a > max) {
				flag = true;
			}
			prod *= a;
		}

		if (flag)
			pr.println(-1);
		else
			pr.println(prod);

		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
