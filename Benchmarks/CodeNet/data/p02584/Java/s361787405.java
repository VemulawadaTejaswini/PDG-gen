
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}
	
	static void solve()
	{
		long x = in.nextLong();
		long k = in.nextLong();
		long d = in.nextLong();
		
		if(x == 0) 
		{
			if(k % 2 == 0)
				System.out.println(0);
			else System.out.println(d);
		}
		else
		{
			if(x < 0) x *= -1;
			if(x - (k * d) >= 0) 
			{
				System.out.println(x - (k * d));
				return;
			}
			long mod = x / d + 1;
			if(mod % 2 == 0) System.out.println(Math.abs(x - mod * d));
			else System.out.println(Math.abs(x - mod * d + d));
			
		}
//		else 
//		{
//			if(x < 0) x *= -1;
//			if(x - (k * d) >= 0) 
//			{
//				System.out.println(x - (k * d));
//				return;
//			}
//			long mod = x / d;
//			
//			if(k % 2 == 1)
//				System.out.println(Math.abs(x - mod * d));
//			else
//			{
//				System.out.println(Math.abs(x - (mod + 1) * d));
//			}
//		}
		
		
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
	}
}



