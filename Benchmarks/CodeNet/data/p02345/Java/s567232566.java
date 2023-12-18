import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static class StarrySkyTree{
		private static final long INF = Long.MAX_VALUE / 2 - 1;
		private static final long DEFAULT = 0; // 単位元

		int n; long[] min, add; // add[k]...範囲に足した値. min[k]...その時点での最小値

		public StarrySkyTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2;} this.n = n;
			min = new long[this.n * 2 - 1]; add = new long[this.n * 2 - 1];
			for(int i = 0; i < this.n * 2 - 1 ; i++){
				min[i] = INF; add[i] = DEFAULT;
			}
		}

		// [a, b) に v を足す
		public void add(long v, int a, int b){ add(v, a, b, 0, 0, this.n); }
		private void add(long v, int a, int b, int k, int l, int r){
			if(r <= a || b <= l){ return; }
			if(a <= l && r <= b) {
				add[k] += v;
			}else{
				add(v, a, b, k * 2 + 1, l, (l + r) / 2);
				add(v, a, b, k * 2 + 2, (l + r) / 2, r);
			}
			min[k] = (k >= (this.n - 1) ? DEFAULT : Math.min(min[k * 2 + 1], min[k * 2 + 2])) + add[k];
		}

		// [a, b) の範囲での最小値を求める
		public long get_min(long a, long b){ return get_min(a, b, 0, 0, this.n); }
		private long get_min(long a, long b, int k, int l, int r){
			if(r <= a || b <= l){ return INF; }
			if(a <= l && r <= b){ return min[k]; }

			final long left_min  = get_min(a, b, k * 2 + 1, l, (l + r) / 2);
			final long right_min = get_min(a, b, k * 2 + 2, (l + r) / 2, r);
			return Math.min(left_min, right_min) + add[k];
		}

		// [index] での値を求める
		public long get_value(int index){
			int k = index + this.n - 1;
			long value = add[k];
			while(k > 0){ k = (k - 1) / 2; value += add[k]; }
			return value;
		}
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			final int n = sc.nextInt();
			final int q = sc.nextInt();
			
			StarrySkyTree tree = new StarrySkyTree(n);
			for(int i = 0; i < n; i++){
				tree.add(Integer.MAX_VALUE, i, i + 1);
			}
			
			for(int i = 0; i < q; i++){
				final int com = sc.nextInt();
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				if(com == 0){
					tree.add(y - tree.get_value(x), x, x + 1);
				}else{
					System.out.println(tree.get_min(x, y + 1));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
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

		public void close() throws IOException {
			br.close();
		}
	}
}