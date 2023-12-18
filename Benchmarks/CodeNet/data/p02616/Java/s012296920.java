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
			final int K = sc.nextInt();
			
			final long MOD = 1000000007;
			
			long[] as = new long[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextLong();
			}
			
			Arrays.sort(as);
			
			ArrayList<Long> plus = new ArrayList<Long>();
			ArrayList<Long> zero = new ArrayList<Long>();
			ArrayList<Long> minus = new ArrayList<Long>();
			
			for(int i = 0; i < N; i++) {
				if(as[i] > 0) {
					plus.add(as[i]);
				}else if(as[i] < 0) {
					minus.add(as[i]);
				}else {
					zero.add(as[i]);
				}
			}
			
			Collections.sort(plus);
			Collections.sort(minus);
			Collections.reverse(plus);
			
			if(plus.size() + minus.size() < K) {
				System.out.println(0);
				return;
			}
			
			if(plus.isEmpty()) {
				long answer = 1;
				
				if(K % 2 == 1) {
					for(int i = 0; i < K; i++) {
						answer *= (MOD + minus.get((minus.size() - 1) - i)) % MOD;
						answer %= MOD;
					}
				}else {
					for(int i = 0; i < K; i++) {
						answer *= (MOD + minus.get(i)) % MOD;
						answer %= MOD;
					}
				}
				
				System.out.println(answer);
				return;
			}
			
			int plus_index = 0, minus_index = 0;
			long answer = 1;
			
			for(int i = 0; i < (K / 2); i++) {
				if(plus_index + 1 >= plus.size()) {
					answer *= (MOD + minus.get(minus_index + 0)) % MOD;
					answer %= MOD;
					answer *= (MOD + minus.get(minus_index + 1)) % MOD;
					answer %= MOD;
					
					minus_index += 2;
				}else if(minus_index + 1 >= minus.size()) {
					answer *= plus.get(plus_index + 0);
					answer %= MOD;
					answer *= plus.get(plus_index + 1);
					answer %= MOD;
					
					plus_index += 2;
				}else {
					final long p = plus.get(plus_index + 0) * plus.get(plus_index + 1);
					final long m = minus.get(minus_index + 0) * minus.get(minus_index + 1);
					
					if(p < m) {
						answer *= (MOD + minus.get(minus_index + 0)) % MOD;
						answer %= MOD;
						answer *= (MOD + minus.get(minus_index + 1)) % MOD;
						answer %= MOD;
						
						minus_index += 2;
					}else {
						answer *= plus.get(plus_index + 0);
						answer %= MOD;
						answer *= plus.get(plus_index + 1);
						answer %= MOD;
						
						plus_index += 2;
					}
				}
			}
			
			if(K % 2 == 0) {
				System.out.println(answer);
				return;
			}
			if(K % 2 != 0 && plus_index < plus.size()) {
				answer *= plus.get(plus_index);
				answer %= MOD;
				System.out.println(answer);
				return;
			}

			plus_index = plus.size() - 2;
			minus_index = minus.size() - 2;
			answer = 1;
			for(int i = 0; i < (K / 2); i++) {
				if(plus_index < 0) {
					answer *= (MOD + minus.get(minus_index + 0)) % MOD;
					answer %= MOD;
					answer *= (MOD + minus.get(minus_index + 1)) % MOD;
					answer %= MOD;
					
					minus_index -= 2;
				}else if(minus_index < 0) {
					answer *= plus.get(plus_index + 0);
					answer %= MOD;
					answer *= plus.get(plus_index + 1);
					answer %= MOD;
					
					plus_index -= 2;
				}else {
					final long p = plus.get(plus_index + 0) * plus.get(plus_index + 1);
					final long m = minus.get(minus_index + 0) * minus.get(minus_index + 1);
					
					if(p > m) {
						answer *= (MOD + minus.get(minus_index + 0)) % MOD;
						answer %= MOD;
						answer *= (MOD + minus.get(minus_index + 1)) % MOD;
						answer %= MOD;
						
						minus_index -= 2;
					}else {
						answer *= plus.get(plus_index + 0);
						answer %= MOD;
						answer *= plus.get(plus_index + 1);
						answer %= MOD;
						
						plus_index -= 2;
					}
				}
			}
			
			if(K % 2 != 0) {
				throw new RuntimeException();
				/*
				answer *= minus.get(minus_index + 1);
				answer %= MOD;
				*/
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
