

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
		
		int[] one = in.readarr(n);
		int[] two = in.readarr(m);
		
		int count1 = 0, count2 = 0;
		int num = 0;
		while(true)
		{
			if(count1 == one.length) 
			{
				while(count2 < two.length && two[count2] <= k)
				{
					k -= two[count2];
					num++;
					count2++;
				}
				break;
			}
			else if(count2 == two.length) 
			{
				while(count1 < one.length && one[count1] <= k)
				{
					k -= one[count1];
					num++;
					count1++;
				}
				break;
			}
			if(one[count1] > k && two[count2] > k) break;
			if(one[count1] >= two[count2])
			{
				k -= two[count2];
				count2++;
				num++;
			}
			else
			{
				k -= one[count1];
				count1++;
				num++;
			}
		}
		System.out.println(num);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}



