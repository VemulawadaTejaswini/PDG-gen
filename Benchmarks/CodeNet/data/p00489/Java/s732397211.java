import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int teams=sc.nextInt();
		int[][] kachiten=new int[teams][2];
		Arrays.fill(kachiten[0], 0);
		Arrays.fill(kachiten[1], 0);
		for(int i=0; i<teams; i++) {
			kachiten[i][1]=i;
		}
		for(int i=0; i<teams*(teams-1)/2; i++) {
			int[] tmp=new int[4];
			for(int j=0; j<4; j++) {
				tmp[j]=sc.nextInt()-1;
			}
			if(tmp[2]==tmp[3]) {
				kachiten[tmp[0]][0]++;
				kachiten[tmp[1]][0]++;
			}
			if(tmp[2]>tmp[3]) {
				kachiten[tmp[0]][0]+=3;
			}
			if(tmp[2]<tmp[3]) {
				kachiten[tmp[1]][0]+=3;
			}
		}
		quick_sort(kachiten,0,teams-1);
		int[] rank=new int[teams];
		int now=kachiten[teams-1][0];
		int jyuni=1;
		for(int i=0; i<teams; i++) {
			if(now==kachiten[teams-1-i][0]){
				rank[kachiten[teams-1-i][1]]=jyuni;
				now=kachiten[teams-1-i][0];
			}
			else if(now!=kachiten[teams-1-i][0]) {
				jyuni=teams-(teams-1-i);
				rank[kachiten[teams-1-i][1]]=jyuni;
				now=kachiten[teams-1-i][0];
			}
		}
		for(int i=0; i<teams; i++) {
			pl(rank[i]);
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
	static void quick_sort(int[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2][0];
		int l = left, r = right;
		int tmp,tmp1,tmp2;
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
}
