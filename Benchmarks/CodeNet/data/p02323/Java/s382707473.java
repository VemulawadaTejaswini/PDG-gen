
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
		int V=sc.nextInt();	//Vertex->頂点数
		int E=sc.nextInt();//Edge->辺の数
		int[][] rinsetu=new int[V][V];
		int INF=1000000007;
		int[][] bitDP=new int[1<<V][V];
		//最初だからねしょうがないね
		//巡回セールスマン問題は、最初の地点は決まっておらず、任意の頂点からスタートできるので、
		//かならずしもスタートを頂点0からできないのでは？と思うが、それは偽で、
		//巡回セールスマン問題でもとめる最短経路は閉路（サイクル）なので、そのサイクルを構成する任意の点から始めても、
		//同じ答えを出すことができるので、スタートを頂点0だと決め打ちしても問題ない。
		for (int i = 0; i < V; i++) {
			Arrays.fill(rinsetu[i], INF);
		}
		for(int i=0; i<(1<<V); i++) {
			for(int j=0; j<V; j++) {
				bitDP[i][j]=INF;
			}
		}
		for(int i=0; i<E; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			int cost=sc.nextInt();
			rinsetu[from][to]=cost;
		}
		bitDP[1][0]=0;
		for(int i=0; i<(1<<V); i++) {
			for(int j=0; j<V; j++) {
				if(bitDP[i][j]==INF) {
					continue;		//経路を確立していないなら
				}
				else {
					for(int k=0; k<V; k++) {
						if((1&i>>k)==1) {
							continue;
						}
						else if(rinsetu[j][k]==INF){
							continue;
						}
						else {
							int nexti=i|(1<<k);
							bitDP[nexti][k]=Math.min(bitDP[nexti][k], bitDP[i][j]+rinsetu[j][k]);
						}
					}
				}
			}
		}
		int all=(1<<V)-1;
		int min=INF;
		for(int i=0; i<V; i++) {
			if(bitDP[all][i]==INF) {
				continue;
			}
			else if(rinsetu[i][0]==INF) {//さいしょにもどれないとき
				continue;
			}
			else {
				int allcost=bitDP[all][i]+rinsetu[i][0];
				min=Math.min(min, allcost);
			}
		}
		if(min==INF) {
			pl(-1);
		}
		else {
			pl(min);
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
