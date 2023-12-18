package JPMC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//5
//10101
//10111
//11101
//00001
//00001

//4
//1000
//3001
//0001
//0001

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		int n=sc.nextInt();
		long maxSum=Long.MIN_VALUE,minSum=Long.MAX_VALUE,maxdiff=Long.MIN_VALUE,minDiff=Long.MAX_VALUE;
		long ans=Long.MIN_VALUE;
		for(int i=0;i<n;i++) {
			long x=sc.nextLong(),y=sc.nextLong();
			maxSum=Math.max(x+y, maxSum);
			minSum=Math.min(x+y, minSum);
			maxdiff=Math.max(x-y, maxdiff);
			minDiff=Math.min(x-y, minDiff);
			
		}
		ans=Math.max(ans, Math.max(maxSum-minSum, maxdiff-minDiff));
		System.out.println(ans);
	}

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

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
