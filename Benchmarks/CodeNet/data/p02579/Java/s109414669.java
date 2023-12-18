
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{

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
			static Deque<Point> que;
			static int ch,cw,dh,dw;
			static int []ph = {-2,-1,0,1,2};
			static int []pw = {-2,-1,0,1,2};
			

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
				que = new ArrayDeque<Point>();
				
				for(int i = 0 ; i < h ;i++) {
					for(int j = 0 ; j < w ;j++) {
						map[i][j] = Integer.MAX_VALUE;
					}
				}
				map[ch][cw] = 0;
				Point st = new Point(ch,cw);
				que.addFirst(st);
				
				while(!que.isEmpty()) {
					
					Point now = que.poll();
					
					int nh = now.getH();
					int nw = now.getW();
					
					for(int i = 0 ; i < 5 ;i++) {
						for(int j = 0 ; j < 5 ;j++) {
							int mh = nh + ph[i];
							int mw = nw + pw[j];
							
							if(mh >= h || mw >= w) {
								continue;
							}
							if(mh < 0 || mw < 0) {
								continue;
							}
							if(grid[mh][mw] == '#') {
								continue;
							}
							
							int tmp = Math.abs(ph[i])+Math.abs(pw[j]);
							int cost = tmp == 1? 0 : 1;
							
							if(map[mh][mw] > map[nh][nw] + cost) {
							map[mh][mw] = map[nh][nw] + cost;
							
							Point e = new Point(mh,mw);
							out.println(mh+" "+mw+" "+map[mh][mw]);
							
							if(cost == 1) {
								que.addLast(e);
							}
							else {
								que.addFirst(e);
							}
						}
					}
				}
			}					
				
				int ans = map[dh][dw] >= Integer.MAX_VALUE ? -1: map[dh][dw];
				out.println(ans);
				
				
				}
			}
			
			
		
		static class Point{
			private int h;
			private int w;
			
			public Point(int h ,int w) {
				this.h = h;
				this.w = w;		
			}
			
			public int getH() {
				return h;
			}
			public int getW() {
				return w;
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
	
