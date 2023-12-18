

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{

	public static void main(String args[]) throws Exception {

		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		long n = sc.nextLong();

		long count = 2, range = 26;

		while (range < n) {

			range = range + (long) (Math.pow(26, count));
			// System.out.println(range);
			count++;
		}
		count--;
		// System.out.println(count);
		long i = 26L;
		StringBuilder ans = new StringBuilder("");

		while (count > 0) {

			long mod = n % i;
			//System.out.println("Hi " + mod);
			if(mod != 0 && mod != 26)
				mod /= (i / 26);
			//System.out.println(mod);
			ans.append((char) (((mod == 0 || mod == 26) ? 26 : mod)+ 96));
			i *= 26;
			count--;
		}

		pr.println(ans.reverse());
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
