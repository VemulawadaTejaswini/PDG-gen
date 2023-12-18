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
	
	public static final long MOD = 998244353;
	
	public static long mod_inv(long a, long m){
		return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	public static long[] fact_10_memo;
	public static long[][] suc_lazy_memo;
	
	public static class LazySetSumSegmentTree {
		int n;
		long[] dat, lazy;
		boolean[] push;

		public LazySetSumSegmentTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2; }
			this.n = n;
			dat = new long[this.n * 2 - 1];
			lazy = new long[this.n * 2 - 1];
			push = new boolean[this.n * 2 - 1];
		}

		private void evaluate_lazy(int k, int l, int r) {
			if(!push[k]){
				return;
			}
			dat[k] = suc_lazy_memo[(int)(lazy[k])][(r - l)];
			if(k < n - 1){
				lazy[k * 2 + 1] = lazy[k * 2 + 2] = lazy[k];
				push[k * 2 + 1] = push[k * 2 + 2] = true;
			}
			lazy[k] = 0;
			push[k] = false;
		}

		private void update_node(int k, int l, int r) {
			dat[k] = (((dat[k * 2 + 1] * fact_10_memo[(r - l) / 2]) % MOD) + (dat[k * 2 + 2])) % MOD;
		}

		public void set(long v, int a, int b) {
			set(v, a, b, 0, 0, this.n);
		}

		public void set(long v, int a, int b, int k, int l, int r) {
			evaluate_lazy(k, l, r);
			if(r <= a || b <= l){
				return;
			}else if(a <= l && r <= b){
				lazy[k] = v;
				push[k] = true;
				evaluate_lazy(k, l, r);
			}else{
				set(v, a, b, k * 2 + 1, l, (l + r) / 2);
				set(v, a, b, k * 2 + 2, (l + r) / 2, r);
				update_node(k, l, r);
			}
		}

		public long sum(int a, int b) {
			return sum(a, b, 0, 0, this.n);
		}

		public long sum(int a, int b, int k, int l, int r) {
			evaluate_lazy(k, l, r);
			if(r <= a || b <= l){
				return 0;
			}else if(a <= l && r <= b){
				return dat[k];
			}else{
				final long v1 = sum(a, b, k * 2 + 1, l, (l + r) / 2);
				final long v2 = sum(a, b, k * 2 + 2, (l + r) / 2, r);
				update_node(k, l, r);
				return ((v1 * fact_10_memo[(r - l) / 2] % MOD) + v2) % MOD;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int Q = sc.nextInt();
			
			LazySetSumSegmentTree seg = new LazySetSumSegmentTree(N);
			final int size_diff = seg.n - N;

			fact_10_memo = new long[seg.n + 1];
			fact_10_memo[0] = 1;
			for(int i = 0; i < seg.n; i++) {
				fact_10_memo[i + 1] = (fact_10_memo[i] * 10) % MOD;
			}
			
			suc_lazy_memo = new long[10][seg.n + 1];
			for(int i = 0; i < 10; i++) {
				suc_lazy_memo[i][0] = 0;
				for(int j = 0; j < seg.n; j++) {
					suc_lazy_memo[i][j + 1] = (suc_lazy_memo[i][j] * 10 + i) % MOD;
				}
			}
			
			seg.set(1, 0, N);
			//System.out.println(seg.sum(0, N) * mod_inv(mod_pow(10, size_diff, MOD), MOD) % MOD);
			
			for(int q = 0; q < Q; q++) {
				final int l = sc.nextInt() - 1;
				final int r = sc.nextInt() - 1;
				final int D = sc.nextInt();
				
				seg.set(D, l, r + 1);
				
				System.out.println(seg.sum(0, N) * mod_inv(fact_10_memo[size_diff], MOD) % MOD);
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
