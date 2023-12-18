
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
		
		int[] ones = in.readarr(n);
		int[] twos = in.readarr(m);
		
		Queue<Integer> one = new LinkedList<Integer>();
		Queue<Integer> two = new LinkedList<Integer>();
		
		for(int i : ones) one.add(i);
		for(int i : twos) two.add(i);
		
		int num = 0;
		
		while(true)
		{
			if(one.isEmpty() && two.isEmpty()) break;
			if(one.isEmpty()) 
			{
				while(k >= two.peek())
				{
					num++;
					k -= two.poll();
					if(two.isEmpty()) break;
				}
				break;
			}
			else if(two.isEmpty())
			{
				while(k >= one.peek()) 
				{
					num++;
					k -= one.poll();
					if(one.isEmpty()) break;
				}
				break;
			}
			
			if(k < one.peek() && k < two.peek()) break;
			if(one.peek() < two.peek() && k >= one.peek())
			{
				k -= one.poll();
				num++;
			}
			else if(two.peek() <= one.peek() && k >= two.peek())
			{
				k -= two.poll();
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



