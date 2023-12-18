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
			final int N = sc.nextInt();
			final long K = sc.nextInt();
			
			int[] ps = new int[N];
			long[] cs = new long[N];
			
			for(int i = 0; i < N; i++) {
				ps[i] = sc.nextInt() - 1;
			}
			for(int i = 0; i < N; i++) {
				cs[i] = sc.nextLong();
			}
			
			int[] loops = new int[N];
			long[][] benefits = new long[N][];
			
			for(int start = 0; start < N; start++) {
				int pos = start, cnt = 0;
				
				do {
					pos = ps[pos];
					cnt++;
				} while(pos != start);
				
				loops[start] = cnt;
				benefits[start] = new long[loops[start]];

				long benefit = 0;
				pos = start; cnt = 0;
				do {
					pos = ps[pos];
					benefit += cs[pos];
					benefits[start][cnt] = benefit;
					cnt++;
				} while(pos != start);
			}
			
			long answer = Long.MIN_VALUE;
			for(int start = 0; start < N; start++) {
				final int loop = loops[start];
				
				if(K < loop) {
					for(int i = 0; i <= K; i++) {
						answer = Math.max(answer, benefits[start][i]);
					}
				}else {
					final long loop_benefit = benefits[start][loop - 1];
					if(loop_benefit < 0) {
						for(int i = 0; i < loop; i++) {
							answer = Math.max(answer, benefits[start][i]);
						}
					}else {
						final long loop_times = K / loop;
						final long loop_mod = K % loop;
						
						answer = Math.max(answer, (loop_times - 1) * benefits[start][loop - 1]);
						for(int i = 0; i < loop; i++) {
							answer = Math.max(answer, benefits[start][i] + (loop_times - 1) * benefits[start][loop - 1]);
						}
						answer = Math.max(answer, (loop_times - 0) * benefits[start][loop - 1]);
						for(int i = 0; i < (loop_mod - 1); i++) {
							answer = Math.max(answer, benefits[start][i] + (loop_times - 0) * benefits[start][loop - 1]);
						}
					}
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
