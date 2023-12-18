import java.io.*;
import java.util.*;

public class Main {
	
	static int c,d,n,m;
	static int adj[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	static int maj[][] = {{-1,-1},{-1,1},{1,-1},{1,1},{-2,-2},{-2,-1},{-2,0},{-2,1},{-2,2},{-1,-2},{0,-2},{1,-2},{2,-2},{2,-1},{2,0},{2,1},{2,2},{-1,2},{0,2},{1,2}};                            ;
	static int board[][];
	
	static boolean legal(int x, int y) {
		if(x<0||y<0||x>=n||y>=m||board[x][y]==1) return false;
		else return true;
	}
	/*static void search(int arr[][], int i , int j , int ans) {
		int found = 0;
		if(i==c-1&&j==d-1) 
		{
			Ans = ans;
		}
		for(int q[] : adj) {
			int x = i+q[0];
			int y = j+q[1];
			if(x<0||x>=n||y<0||y>=m) continue;
			else if(vis[x][y]!=1){
				if(arr[x][y]==0) {
					found = 1;
					search(arr,x,y,ans);
				}
			}
		}
		if(found==0) {
			for(int w[] : maj) {
				int x = i+w[0];
				int y = j+w[1];
				if(x<0||x>=n||y<0||y>=m) continue;
				else if(vis[x][y]!=1){
					if(arr[x][y]==0) {
						search(arr,x,y,ans+1);
					}
				}
			}
		}
	}*/
	
	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();m = in.nextInt();
        int a = in.nextInt()-1;int b = in.nextInt()-1;
        int c = in.nextInt()-1;int d = in.nextInt()-1;
        board = new int[n][m];
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
        	int found = 0;
        	for(int x[] : adj) {
        		int nx = curX+x[0], ny = curY+x[1];
        		if(legal(nx,ny)) {
        			if(dis[nx][ny]>dis[curX][curY]) {
        				found = 1;
        				dis[nx][ny] = dis[curX][curY];
        				qx.addFirst(nx);
        				qy.addFirst(ny);
        			}
        		}
        	}
        	if(found==0) {
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









