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
	
	public static class SegTree {
		int n;
		long[] dat;

		public SegTree(int n_) {
			int n = 1;
			while(n < n_){
				n *= 2;
			}

			this.n = n;
			dat = new long[this.n * 2 - 1];
			for(int i = 0; i < this.n * 2 - 1; i++){
				dat[i] = 0;
			}
		}

		public long calc(long fst, long snd) {
			return Math.max(fst, snd);
		}

		public void update(int k, long a) {
			k += n - 1;
			dat[k] = a;

			while(k > 0){
				k = (k - 1) / 2;
				dat[k] = calc(dat[k * 2 + 1], dat[k * 2 + 2]);
			}
		}

		public long query(int a, int b, int k, int l, int r) {
			if(r <= a || b <= l){
				return 0;
			}else if(a <= l && r <= b){
				return dat[k];
			}else{
				return calc(query(a, b, k * 2 + 1, l, (l + r) / 2), query(a, b, k * 2 + 2, (l + r) / 2, r));
			}
		}

		public long query(int a, int b) {
			return query(a, b, 0, 0, n);
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			int[] as = new int[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextInt();
			}
			
			final int LIMIT = 300000;
			SegTree seg = new SegTree(LIMIT + 1);
			
			for(int i = 0; i < N; i++) {
				final int a = as[i];
				final long score = seg.query(Math.max(0, a - K), Math.min(LIMIT + 1, a + K + 1));
				//System.out.println(a + " " + score);
				seg.update(a, score + 1);
			}
			
			System.out.println(seg.query(0, LIMIT + 1));
			
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
