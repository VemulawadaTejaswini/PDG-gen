import java.util.*;

class Main{
	public static void main(String args[]){
		Solve s = new Solve();
		s.solve();
	}
}

class Solve{
	Scanner in = new Scanner(System.in);

	int ans;
	int[] dx = {0, 0, -1, 1};
	int[] dy = {-1, 1, 0, 0};
	int n, m;

	void solve(){
		while(in.hasNext()){
			m = in.nextInt(); n = in.nextInt();
			if(n == 0 && m == 0) return;
			int[][] f = new int[n][m];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++) f[i][j] = in.nextInt();
			}

			ans = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					int[][] v = f;
					calc(i, j, v, 0);
				}
			}

			System.out.println(ans);
		}
	}
	void calc(int x, int y, int[][] v, int num){
		ans = Math.max(ans, num);
		for(int i = 0; i < 4; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(nx >= 0 && nx < m && ny >= 0 && ny < n && v[ny][nx] == 1){
				v[ny][nx] = 0;
				calc(nx, ny, v, num + 1);
				v[ny][nx] = 1;
			}
		}
	}
}