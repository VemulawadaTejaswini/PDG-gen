
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
	
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			FastInput in = new FastInput(inputStream);
			PrintWriter out = new PrintWriter(outputStream);
			ABC176D solver = new ABC176D();
			solver.solve(1, in, out);
			out.close();
		}

		static class ABC176D {
			
			static int h,w;
			static int [][]map;
			static char [][]grid;
			static boolean [][]visited;
			static int ans;
			static Queue <Point> pq;
			static int ch,cw,dh,dw;
			

			public void solve(int testNum, FastInput in, PrintWriter out) {

				h = in.nextInt();
				w = in.nextInt();
				
				ch = in.nextInt()-1;
				cw = in.nextInt()-1;
				dh = in.nextInt()-1;
				dw = in.nextInt()-1;
				
				grid = in.nextChar2DArray(h);
				visited = new boolean [h][w];
				map = new int [h][w];
				pq = new PriorityQueue<Point>();
				
				for(int i = 0 ; i < h ;i++) {
					for(int j = 0 ; j < w ;j++) {
						map[i][j] = Integer.MAX_VALUE;
					}
				}
				
				map[ch][cw] = 0;
				
				Point st = new Point(ch,cw,0);
				bfs01(st);
				
				int ans = map[dh][dw] == Integer.MAX_VALUE ? -1: map[dh][dw];
				
				out.println(ans);
				
				
			}
			
			static void bfs01(Point now) {
				
				int []mh = {-2,-1,0,1,2};
				int []mw = {-2,-1,0,1,2};
				
				int nh = now.getH();
				int nw = now.getW();
				visited[nh][nw] = true;
									
					for(int i = 0 ; i < 5 ;i++) {
						for(int j = 0 ; j < 5 ; j++) {
						int ph = mh[i] + nh;
						int pw = mw[j] + nw;
						
						if(ph < 0 || pw < 0) {
							continue;
						}
						if(ph >= h || pw >= w) {
							continue;
						}
						if(grid[ph][pw] == '#') {
							continue;
						}
						if(ph == nh && pw == nw) {
							continue;
						}
						if(visited[ph][pw]) {
							continue;
						}
						
						Point e;
						if(Math.abs(mh[i])+Math.abs(mw[j]) <= 1) {
						 e = new Point(ph,pw,0);
						}
						else {
						 e = new Point(ph,pw,1);
						 if(pq.contains(e)) {
								continue;
							}
						}
						map[ph][pw] = Math.min(map[nh][nw] + e.getCost(),map[ph][pw]);
						pq.add(e);
					}
				}
					
					if(pq.isEmpty()) {
						return;
					}
					bfs01(pq.poll());
			}
		}
			
		
		static class Point implements Comparable<Point>{
			private int h;
			private int w;
			private int cost;
			
			public Point(int h , int w,int cost) {
				this.h = h;
				this.w = w;
				this.cost = cost;
				
			}
			
			public int getH() {
				return h;
			}
			public int getW() {
				return w;
			}
			public int getCost() {
				return cost;
			}

			@Override
			public int compareTo(Point o) {
				return Integer.compare(cost, o.getCost());
			}
			
			@Override
			public boolean equals(Object o) {
				if(!(o instanceof Point)) {
					return false;
				}
				Point p = (Point)o;
				return (h == p.getH() && w == p.getW());
			}
			
			
			
		}

		
		static class FastInput{
			private final BufferedReader in;
			private String[] buff;
			private int index = 0;
			
			public FastInput(InputStream is) {
				in = new BufferedReader(new InputStreamReader(is));
			}
			String nextLine() {
				try {
					return in.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
			String next() {
				while (buff == null || index >= buff.length) {
					buff = nextLine().split(" ");
					index = 0;
				}
				return buff[index++];
			}
			int nextInt() {
				return Integer.parseInt(next());
			}
			
			long nextLong() {
				return Long.parseLong(next());
			}
			
			Double nextDouble() {
				return Double.parseDouble(next());
			}
			
			BigInteger nextBigInteger() {
				return new BigInteger(next());
			}
			
			BigDecimal nextBigDecimal() {
				return new BigDecimal(next());
			}
			
			public int[] nextIntArray(final int n) {
				final int[] res = new int [n];
				
				for(int i = 0 ; i < n ;i++) {
					res[i] = nextInt();
				}
				return res;
			}
			
			public long[] nextLongArray(final int n) {
				final long[] res= new long [n];
				
				for(int i = 0 ; i < n ;i++) {
					res[i] = nextLong();
				}
				return res;
			}
			
			public double[] nextDoubleArray(final int n ) {
				final double[] res = new double [n];
				
				for(int i = 0 ; i < n ;i++) {
					res[i] = nextDouble();
				}
				return res;
			}
			
			
			public int[][] nextInt2DArray(final int n , final int m){
				int [][]res = new int [n][m];
				
				for(int i = 0 ; i < n ;i++) {
					for(int j = 0 ; j < m ;j++) {
						res[i][j] = nextInt();
					}
				}
				return res;
			}
			public long[][] nextLong2DArray(final int n , final int m){
				long [][]res = new long [n][m];
				
				for(int i = 0 ; i < n ;i++) {
					for(int j = 0 ; j < m ;j++) {
						res[i][j] = nextLong();
					}
				}
				return res;
			}
			
			public char[][] nextChar2DArray(final int n){
				char [][]res = new char [n][];
				
				for(int i = 0 ; i < n ;i++) {
					String s = next();
					res[i] = s.toCharArray();
				}
				
				return res;
			}
		}

}
