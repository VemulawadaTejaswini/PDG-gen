import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int ch = sc.nextInt()-1;
		int cw = sc.nextInt()-1;
		int dh = sc.nextInt()-1;
		int dw = sc.nextInt()-1;
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
			grid[i] = sc.next().toCharArray();
		}
		/*
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		*/
		
		// 計算
		long result = 0;
		int INF = 1001001001;
		int[][] dist = new int[h][w];
		for(int i = 0; i < h; i++){
		    Arrays.fill(dist[i], INF);
		}
		dist[ch][cw] = 0;
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		q.addFirst(new int[]{ch, cw});
		int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}; 
		int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2};
		while(!q.isEmpty()){
		    int[] p = q.pollFirst();
    		int i = p[0];
    		int j = p[1];
		    int now = dist[i][j];
    		for(int k = 0; k < dx.length; k++){
    		    int ni = i + dx[k];
    		    int nj = j + dy[k];
    		    int c = 1;
    		    if(abs(dx[k]) + abs(dy[k]) == 1) c = 0;
    		    if(0 <= ni && ni < h && 0 <= nj && nj < w){
    		        if(grid[ni][nj] == '.'){
    		            if(now + c < dist[ni][nj]){
    		                dist[ni][nj] = now + c;
    		                if(c == 0){
    		                    q.addFirst(new int[]{ni, nj});
    		                }else{
    		                    q.addLast(new int[]{ni, nj});
    		                }
    		            }
    		        }
    			}
    		}
		}
		
		if(dist[dh][dw] == INF){
		    result = -1;
		}else{
		    result = dist[dh][dw];
		}
		//System.out.println(Arrays.toString(dist));
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
