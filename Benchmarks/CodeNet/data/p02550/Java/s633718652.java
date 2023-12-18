import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static long solve_naive(long N, int X, int M) {
		long a = X;
		long answer = a;
		
		for(int i = 1; i < N; i++) {
			a = (a * a) % M;
			answer += a;
		}
		
		return answer;
	}
	
	public static long solve_smart(long N, int X, int M) {
		int[] counts = new int[M];
		long[] sums = new long[M];
		Arrays.fill(counts, -1);
		counts[X] = 0;
		
		int length = 1;
		long length_sum = X;

		long already_sum = -1;
		long already_count = -1;
		long already_value = -1;
		
		{
			int c = 1;
			int a = X;
			
			while(true) {
				if(c >= N) { return length_sum; }
				
				if(counts[a] > 0) {
					already_sum = length_sum;
					already_count = c;
					already_value = a;
					
					length = c - counts[a];
					length_sum -= sums[a];

					break;
				}
				
				counts[a] = c;
				sums[a] = length_sum;
				
				c += 1;
				a = (int)(((long)(a) * a) % M);
				length_sum += a;
				
			}
		}
		
		long answer = already_sum + (((N - already_count) / length) * length_sum);
		N = (N - already_count) % length;
		
		long a = already_value;
		answer += a;
		for(int i = 1; i <= N; i++) {
			a = (a * a) % M;
			answer += a;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long N = sc.nextLong();
			final int X = sc.nextInt();
			final int M = sc.nextInt();
			
			System.out.println(solve_smart(N, X, M));
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}
