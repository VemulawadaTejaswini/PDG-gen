

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{

	static long expo(long base, long exp) {
		long t = 1L;
		while (exp > 0) {
			if (exp % 2 != 0)
				t = (t * base);

			base = (base * base);
			exp /= 2;
		}
		return t;
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		
		long n = sc.nextLong();
		HashSet<Integer> factors = new HashSet<>();
		boolean isPrime = true;
		long count = 0;
		
		if(n == 1) {
			
			pr.println("0");
			pr.close();
			return;
		}
		
		for(long i = 2; i * i <= n; i++) {
			
			long fact = i;
			
			if(n % i == 0)
				isPrime = false;
			
			while(n % fact == 0) {
				
				n /= fact;
				fact = fact * i;
				count++;
			}
			
		}
		
		if(isPrime)
			pr.println(1);
		else
			pr.println(count);

		
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
