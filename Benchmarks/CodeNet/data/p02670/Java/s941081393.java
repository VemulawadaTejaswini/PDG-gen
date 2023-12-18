import java.util.*;

public class Main {
	static int N;
	static int[][] v;
	static boolean[][] left;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int[] P = new int[N*N];
		for(int i=0; i<N*N; i++)
			P[i] = sc.nextInt()-1;

		v = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				v[i][j] = Math.min(Math.min(i, N-i-1), Math.min(j, N-j-1))+1;
			}
		}
		left = new boolean[N][N];
		
		int ans = 0;
		for(int i=0; i<N*N; i++) {
			int y = P[i]/N;
			int x = P[i]%N;
			ans += v[y][x]-1;
			left[y][x] = true;

			int min = N;
			for(int d=0; d<4; d++) {
				int ny = y + dy[d];
				int nx = x + dx[d];
				if(0<=ny && ny<N && 0<=nx && nx<N) {
					min = Math.min(min, v[ny][nx]);
				} else {
					min = 0;
				}
			}

			dfs(y, x, min);
			
		}
		System.out.println(ans);
		
		sc.close();
	}
	
	static int[] dx = { 0, 1, 0, -1};
	static int[] dy = { 1, 0, -1, 0};
	
	static void dfs(int y, int x, int value) {
		v[y][x] = value;
		for(int d=0; d<4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			if(0<=ny && ny<N && 0<=nx && nx<N) {
				if(left[ny][nx] && v[ny][nx] > v[y][x]) {
					dfs(ny, nx, value);
				} else if(!left[ny][nx] && v[ny][nx] > v[y][x]+1) {
					dfs(ny, nx, value+1);
				}
			}
		}
	}
}
