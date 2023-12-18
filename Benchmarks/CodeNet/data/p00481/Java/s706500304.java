import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int H;
	static int W;
	static int N;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		N=sc.nextInt();
		int[] CHZ=new int[N];
		int INF=1000000007;
		int start=0;
		int goal=0;
		int time=0;
		int[] vis=new int[H*W];
		int[] xvec= {0,1,0,-1};
		int[] yvec= {1,0,-1,0};
		int[][] douro=new int[N][H*W];
		for(int i=0; i<H; i++) {
			String s=sc.next();
			for(int j=0; j<W; j++) {
				if(s.charAt(j)=='S') {
					start=i*W+j;	//座標
					for(int k=0; k<N; k++) {
						douro[k][i*W+j]=0;
					}
				}
				else if(s.charAt(j)=='.') {
					for(int k=0; k<N; k++) {
						douro[k][i*W+j]=0;
					}
				}
				else if(s.charAt(j)=='X') {
					for(int k=0; k<N; k++) {
						douro[k][i*W+j]=INF;
					}
				}
				else{
					for(int k=0; k<N; k++) {
						douro[k][i*W+j]=0;
					}
					CHZ[s.charAt(j)-49]=i*W+j;
				}
			}
		}
		Queue<Integer> Q= new ArrayDeque<Integer>();
		for(int h=0; h<N; h++) {
			if(h==0) {
				goal=CHZ[0];
				Arrays.fill(vis, INF);
				Q=new ArrayDeque<Integer>();
				Q.add(start);
				vis[start]=0;
			}
			else {
				start=CHZ[h-1];
				goal=CHZ[h];
				Arrays.fill(vis, INF);
				Q=new ArrayDeque<Integer>();
				Q.add(start);
				vis[start]=0;
			}
			boolean ok=false;
			while(!Q.isEmpty()) {
				if(ok==true) {
					break;
				}
				else {
					int tmp=Q.poll();
					for(int i=0; i<4; i++) {
						if(tmp/W+yvec[i]>=0 && tmp/W+yvec[i]<H) {
							if(tmp%W+xvec[i]>=0 && tmp%W+xvec[i]<W) {
								int coord=coord(tmp,xvec[i],yvec[i]);
								if(douro[h][coord]==INF) {
									//
								}
								else {
									if(coord==goal) {
										vis[coord]=vis[tmp]+1;
										time+=vis[coord];
										ok=true;
										break;
									}
									else {
										if(vis[coord]>vis[tmp]+1) {
											vis[coord]=vis[tmp]+1;
											Q.add(coord);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		pl(time);
	}
	public static int coord(int a,int xv,int yv) {
		return a+xv+yv*W;
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
}
