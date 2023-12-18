import java.io.*;
import java.util.*;

public class Main {
	
	static int c,d,n,m;
	static int adj[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	static int maj[][];
	static int board[][];
	
	static boolean legal(int x, int y) {
		if(x<0||y<0||x>=n||y>=m||board[x][y]==1) return false;
		else return true;
	}
	
	static void majGen() {
		int i=0;
		for(int x=-2;x<=2;x++,i++) {
			for(int y=-2;y<=2;y++) {
				maj[i][0] = x; maj[i][1] = y; 
			}
		}
	}
	
	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();m = in.nextInt();
        int a = in.nextInt()-1;int b = in.nextInt()-1;
        int c = in.nextInt()-1;int d = in.nextInt()-1;
        board = new int[n][m];
        maj = new int[25][2];
        majGen();
        for(int i=0;i<n;i++) {
        	char ch[] = in.next().toCharArray();
        	for(int j=0;j<m;j++) {
        		if(ch[j]=='#') board[i][j] = 1;
        	}
        }
        int dis[][] = new int[n][m];
        for(int x=0;x<n;x++) Arrays.fill(dis[x], 1_000_000_000);
        ArrayDeque<Integer> qx = new ArrayDeque<>();
        ArrayDeque<Integer> qy = new ArrayDeque<>();
        qx.add(a);qy.add(b);
        dis[a][b] = 0;
        while(!qx.isEmpty()) {
        	int curX = qx.removeFirst(), curY = qy.removeFirst();
        	for(int x[] : adj) {
        		int nx = curX+x[0], ny = curY+x[1];
        		if(legal(nx,ny)) {
        			if(dis[nx][ny]>dis[curX][curY]) {
        				dis[nx][ny] = dis[curX][curY];
        				qx.addFirst(nx);
        				qy.addFirst(ny);
        			}
        		}
        	}
        	for(int x[] : maj) {
        		int nx = curX+x[0], ny = curY+x[1];
        		if(legal(nx,ny)) {
        			if(dis[nx][ny]>dis[curX][curY]+1) {
        				dis[nx][ny] = dis[curX][curY]+1;
        				qx.addLast(nx);
        				qy.addLast(ny);
        			}
        		}
        	}
        }
        out.println((dis[c][d]==1e9)?"-1":dis[c][d]);
        out.flush();
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i] = nextInt();
			return a;
		}
		
		long[] readArray(int n,long x) {
			long a[] = new long[n];
			for(int i=0;i<n;i++) a[i] = nextLong();
			return a;
		}
		
	}
}









