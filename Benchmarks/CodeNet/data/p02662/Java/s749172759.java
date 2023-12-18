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
			final int S = sc.nextInt();
			final long MOD = 998244353;
			
			int[] as = new int[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextInt();
			}
			
			long[][] DP = new long[N + 1][S + 1];
			DP[0][0] = 1;
			for(int item = 0; item < N; item++) {
				final int a = as[item];
				for(int used = item; used >= 0; used--) {
					for(int x = S - a; x >= 0; x--) {
						if(DP[used][x] == 0) { continue; }

						DP[used + 1][x + a] += DP[used][x]; 
						DP[used + 1][x + a] %= MOD;
					}
				}
			}
			//System.out.println(Arrays.deepToString(DP));
			
			long answer = 0;
			{
				long prob = 1;
				for(int used = N; used >= 0; used--) {
					answer += DP[used][S] * prob;
					answer %= MOD;
					prob *= 2;
					prob %= MOD;
				}
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
