

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++)
			ar[i] = sc.nextInt();

		Arrays.parallelSort(ar);
		
		long sum = ar[n - 1];
		int count = 0;
		int idx = n - 2;
		
		while(count < (n - 1) / 2) {
			
			sum += (2L * ar[idx--]);
			count++;
		}
		
		if((n & 1) == 1)
			sum -= ar[++idx];
		pr.println(sum);
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			InputStreamReader inputreader = new InputStreamReader(System.in);
			br = new BufferedReader(inputreader);
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
