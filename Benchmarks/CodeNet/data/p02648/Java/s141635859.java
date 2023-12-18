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
	
	public static void dfs(int node, final int N, int[] vs, int[] ws, final int limit, long[] DP, HashMap<Integer, HashMap<Integer, Integer>> queries, long[] answer) {
		final int index = node - 1;
		final int V = vs[index];
		final int W = ws[index];
		
		long[] nextDP = new long[limit + 1];
		for(int i = 0; i <= limit; i++) { nextDP[i] = DP[i]; }
		
		for(int i = limit - W; i >= 0; i--) {
			nextDP[i + W] = Math.max(nextDP[i + W], nextDP[i] + V);
		}
		long[] answers = new long[limit + 1];
		for(int i = 0; i <= limit; i++) { answers[i] = nextDP[i]; }
		for(int i = 0; i < limit; i++) { answers[i + 1] = Math.max(answers[i + 1], answers[i]); }
		
		for(final Entry<Integer, Integer> entry : queries.get(index).entrySet()) {
			final int answer_idx = entry.getKey();
			final int answer_L = entry.getValue();
			
			answer[answer_idx] = answers[answer_L];
		}
		
		if(node * 2 + 0 <= N) {
			dfs(node * 2 + 0, N, vs, ws, limit, nextDP, queries, answer);
		}
		if(node * 2 + 1 <= N) {
			dfs(node * 2 + 1, N, vs, ws, limit, nextDP, queries, answer);
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			int[] vs = new int[N];
			int[] ws = new int[N];
			for(int i = 0; i < N; i++) {
				final int V = sc.nextInt();
				final int W = sc.nextInt();
				
				vs[i] = V;
				ws[i] = W;
			}
			
			final int Q = sc.nextInt();
			HashMap<Integer, HashMap<Integer, Integer>> queries = new HashMap<Integer, HashMap<Integer, Integer>>();
			for(int i = 0; i < N; i++) { queries.put(i, new HashMap<Integer, Integer>()); }
			for(int i = 0; i < Q; i++) {
				final int v = sc.nextInt() - 1;
				final int L = sc.nextInt();
				
				queries.get(v).put(i, L);
			}
			
			long[] answer = new long[Q];
			dfs(1, N, vs, ws, 100000, new long[100000 + 1], queries, answer);
			
			for(int i = 0; i < Q; i++) {
				System.out.println(answer[i]);
			}
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
