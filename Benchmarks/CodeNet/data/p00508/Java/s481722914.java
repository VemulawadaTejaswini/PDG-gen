import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[][] coord=new long[N][2];
		for(int i=0; i<N; i++) {
			coord[i][0]=sc.nextLong();
			coord[i][1]=sc.nextLong();
		}
		quick_sort(coord,0,N-1);
		long distmin=Long.MAX_VALUE;
		for(int i=1; i<N; i++) {
			distmin=Math.min(distmin, (coord[i][0]-coord[0][0])*(coord[i][0]-coord[0][0])+(coord[i][1]-coord[0][1])*(coord[i][1]-coord[0][1]));
		}
		for(int i=1; i<N-1; i++) {
			for(int j=i-1; j>=0; j--) {
				if(distmin<(coord[i][0]-coord[j][0])*(coord[i][0]-coord[j][0])) {
					break;
				}
				else {
					distmin=Math.min(distmin, (coord[i][0]-coord[j][0])*(coord[i][0]-coord[j][0])+(coord[i][1]-coord[j][1])*(coord[i][1]-coord[j][1]));
				}
			}
			for(int j=i+1; j<N; j++) {
				if(distmin<(coord[i][0]-coord[j][0])*(coord[i][0]-coord[j][0])) {
					break;
				}
				else {
					distmin=Math.min(distmin, (coord[i][0]-coord[j][0])*(coord[i][0]-coord[j][0])+(coord[i][1]-coord[j][1])*(coord[i][1]-coord[j][1]));
				}
			}
		}
		pl(distmin);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}

