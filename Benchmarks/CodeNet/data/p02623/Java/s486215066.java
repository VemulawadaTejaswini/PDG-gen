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
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			final long K = sc.nextLong();
			
			long[] as = new long[N];
			long[] prefix_as = new long[N + 1];
			for(int i = 0; i < N; i++) { as[i] = sc.nextLong(); }
			
			long[] bs = new long[M];
			long[] prefix_bs = new long[M + 1];
			for(int i = 0; i < M; i++) { bs[i] = sc.nextLong(); }
			
			for(int i = 0; i < N; i++) {
				prefix_as[i + 1] += as[i];
				prefix_as[i + 1] += prefix_as[i];
			}
			for(int i = 0; i < M; i++) {
				prefix_bs[i + 1] += bs[i];
				prefix_bs[i + 1] += prefix_bs[i];
			}
			
			int answer = 0;
			for(int i = 0; i <= N; i++) {
				final long rest = K - prefix_as[i];
				if(rest < 0) { continue; }
				
				int pos = Arrays.binarySearch(prefix_bs, rest);
				if(pos < 0) { pos = -(pos + 2); }
				
				answer = Math.max(answer, i + pos);
			}
			
			System.out.println(answer);
			
			
			
			
			
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
