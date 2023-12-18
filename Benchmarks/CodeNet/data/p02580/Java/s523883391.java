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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			final int M = sc.nextInt();
			
			ArrayList<HashSet<Integer>> bombs = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < H; i++) { bombs.add(new HashSet<Integer>()); }
			
			long[] rows = new long[H];
			long[] cols = new long[W];
			
			for(int i = 0; i < M; i++) {
				final int h = sc.nextInt() - 1;
				final int w = sc.nextInt() - 1;
				
				rows[h]++;
				cols[w]++;
				bombs.get(h).add(w);
			}
			
			int rows_fst_max_index = -1, rows_snd_max_index = -1;
			long rows_fst_max_value = -1, rows_snd_max_value = -1;
			for(int i = 0; i < H; i++) {
				if(rows_fst_max_value < rows[i]) {
					rows_snd_max_index = rows_fst_max_index;
					rows_snd_max_value = rows_fst_max_value;
					rows_fst_max_index = i;
					rows_fst_max_value = rows[i];
				}else if(rows_snd_max_value < rows[i]) {
					rows_snd_max_index = i;
					rows_snd_max_value = rows[i];
				}
			}
			if(rows_snd_max_index < 0) {
				rows_snd_max_index = rows_fst_max_index;
				rows_snd_max_value = rows_fst_max_value;
			}
			
			
			long answer = 0;
			for(int col = 0; col < W; col++) {
				final long col_value = cols[col];
				
				final long fst_max_value = col_value + rows_fst_max_value - (bombs.get(rows_fst_max_index).contains(col) ? 1 : 0);
				final long snd_max_value = col_value + rows_snd_max_value - (bombs.get(rows_snd_max_index).contains(col) ? 1 : 0);
				
				//System.out.println(col + " " + col_value + " " + rows_fst_max_value + " " + rows_snd_max_value);
			
				answer = Math.max(answer, Math.max(fst_max_value, snd_max_value));
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
