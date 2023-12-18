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
	
	public static final int TOPK = 3;
	public static class SegTree {
		int n;
		long[][] max;

		public SegTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2; }

			this.n = n;
			max = new long[this.n * 2 - 1][TOPK];
		}
		
		public long[] merge(long[] fst, long[] snd) {
			long[] ret = new long[3];
			int fst_index = 0, snd_index = 0, ret_index = 0;
			
			while(ret_index < TOPK) {
				if(fst_index >= TOPK && snd_index >= TOPK) {
					break;
				}else if(fst_index >= TOPK || fst[fst_index] < snd[snd_index]) {
					ret[ret_index++] = snd[snd_index++];
				}else if(snd_index >= TOPK || fst[fst_index] >= snd[snd_index]) {
					ret[ret_index++] = fst[fst_index++];
				}
			}
			
			return ret;
		}
		public void update(int k, long a) {
			k += n - 1;
			max[k][0] = a;

			while(k > 0){
				k = (k - 1) / 2;
				max[k] = merge(max[k * 2 + 1], max[k * 2 + 2]);
			}
		}

		public long[] query(int a, int b, int k, int l, int r) {
			if(r <= a || b <= l){
				return new long[3];
			}else if(a <= l && r <= b){
				return max[k];
			}else{
				return merge(query(a, b, k * 2 + 1, l, (l + r) / 2), query(a, b, k * 2 + 2, (l + r) / 2, r));
			}
		}

		public long[] query(int a, int b) {
			return query(a, b, 0, 0, n);
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int R = sc.nextInt();
			final int C = sc.nextInt();
			final int K = sc.nextInt();
			
			ArrayList<HashMap<Integer, Long>> board = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i <= R; i++) { board.add(new HashMap<Integer, Long>()); }
			SegTree[] segs = new SegTree[R + 1];
			for(int i = 0; i <= R; i++) { segs[i] = new SegTree(C); }
			
			for(int i = 0; i < K; i++) {
				final int r = sc.nextInt() - 1;
				final int c = sc.nextInt() - 1;
				final long v = sc.nextLong();
				
				board.get(r).put(c, v);
				segs[r].update(c, v);
			}
			if(!board.get(0).containsKey(0)) {
				board.get(0).put(0, 0l);
			}
			if(!board.get(R - 1).containsKey(C - 1)) {
				board.get(R - 1).put(C - 1, 0l);
			}
			board.get(R).put(C, 0l);
			
			long[][] DP = new long[R + 1][C + 1];
			
			for(int curr_row = 0; curr_row < R; curr_row++) {
				for(Entry<Integer, Long> curr_entry: board.get(curr_row).entrySet()) {
					final int next_row = curr_row + 1;
					final int curr_col = curr_entry.getKey();
					
					for(Entry<Integer, Long> next_entry: board.get(next_row).entrySet()) {
						final int next_col = next_entry.getKey();
						
						long[] max = segs[curr_row].query(curr_col, next_col + 1);
						//System.out.println(Arrays.toString(max));
						DP[next_row][next_col] = Math.max(DP[next_row][next_col], DP[curr_row][curr_col] + (max[0] + max[1] + max[2])); 
					}
				}
			}
			
			System.out.println(DP[R][C]);
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
