

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
		int ac = 0, wa = 0, tle = 0, re = 0;
		
		while(n-- > 0) {
			
			String s = sc.next();
			
			if(s.equals("AC"))
				ac++;
			else if(s.equals("WA"))
				wa++;
			else if(s.equals("TLE"))
				tle++;
			else
				re++;
		}
		
		pr.println("AC x " + ac);
		pr.println("WA x " + wa);
		pr.println("TLE x " + tle);
		pr.println("RE x " + re);

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
