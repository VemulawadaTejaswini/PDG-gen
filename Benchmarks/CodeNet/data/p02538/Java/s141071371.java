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
	
	public static long mod_pow(long a, long e, long m) {
		if(e == 0){
			return 1;
		}else if(e == 1) {
			return a;
		}else if(e % 2 == 0){
			long ret = mod_pow(a, e / 2, m);
			return (ret * ret) % m;
		}else{
			return (mod_pow(a, e - 1, m) * a) % m;
		}
	}
	
	public static long mod_suc(long a, long e, long m) {
		if(e == 0){
			return 1;
		}else if(e == 1) {
			return a;
		}else if(e % 2 == 0){
			long ret = mod_suc(a, e / 2, m);
			return ((ret * mod_pow(10, e / 2, m) % m) + ret) % m; 
		}else{
			return (((mod_suc(a, e - 1, m) * 10) % m) + a) % m;
		}
	}
	
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
			dat[k] = mod_suc(lazy[k], (r - l), MOD);
			if(k < n - 1){
				lazy[k * 2 + 1] = lazy[k * 2 + 2] = lazy[k];
				push[k * 2 + 1] = push[k * 2 + 2] = true;
			}
			lazy[k] = 0;
			push[k] = false;
		}

		private void update_node(int k, int l, int r) {
			dat[k] = (((dat[k * 2 + 1] * mod_pow(10, (r - l) / 2, MOD)) % MOD) + (dat[k * 2 + 2])) % MOD;
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
				return ((v1 * mod_pow(10, (r - l) / 2, MOD) % MOD) + v2) % MOD;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int Q = sc.nextInt();
			
			LazySetSumSegmentTree seg = new LazySetSumSegmentTree(N);
			final int size_diff = seg.n - N;
			
			seg.set(1, 0, N);
			//System.out.println(seg.sum(0, N) * mod_inv(mod_pow(10, size_diff, MOD), MOD) % MOD);
			
			for(int q = 0; q < Q; q++) {
				final int l = sc.nextInt() - 1;
				final int r = sc.nextInt() - 1;
				final int D = sc.nextInt();
				
				seg.set(D, l, r + 1);
				
				System.out.println(seg.sum(0, N) * mod_inv(mod_pow(10, size_diff, MOD), MOD) % MOD);
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
