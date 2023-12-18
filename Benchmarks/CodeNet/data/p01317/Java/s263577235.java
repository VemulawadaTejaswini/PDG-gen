import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int N=sc.nextInt(), M=sc.nextInt();
			if(N==0 && M==0) break;

			int[][] tl = new int[N+1][N+1];
			int[][] ts = new int[N+1][N+1];
			for(int i=0;i<M;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int t = sc.nextInt();
				String s = sc.next();

				if(s.equals("S")){
					if(ts[x][y] == 0) ts[x][y] = ts[y][x] = t;
					else ts[x][y] = ts[y][x] = Math.min(ts[x][y],t);
				}
				else{
					if(tl[x][y] == 0) tl[x][y] = tl[y][x] = t;
					else tl[x][y] = tl[y][x] = Math.min(tl[x][y],t);
				}
			}

			int R = sc.nextInt();
			int[] z = new int[R];
			for(int i=0;i<R;i++) z[i] = sc.nextInt();

			int[][] land = floyd(tl);
			int[][] sea = floyd(ts);
			int[][] dp = new int[R+1][N+1];

			for(int[] tmp : dp){
				Arrays.fill(tmp,Integer.MAX_VALUE);
			}

			dp[0][z[0]] = 0;

			for(int i=1;i<R;i++){
				for(int j=1;j<=N;j++){
					if(dp[i-1][j] == Integer.MAX_VALUE) continue;
					if(land[z[i-1]][z[i]] != 0){
						dp[i][j] = Math.min(dp[i][j],dp[i-1][j] + land[z[i-1]][z[i]]);
					}

					for(int k=1;k<=N;k++){
						if(j != k && sea[j][k] != 0 &&
							 (z[i-1] == j || land[z[i-1]][j] != 0) &&
							 (k == z[i] || land[k][z[i]] != 0) ){
							dp[i][k] = Math.min(dp[i][k], dp[i-1][j] + land[z[i-1]][j] + sea[j][k] + land[k][z[i]]);
						}
					}
				}
			}

			int min = Integer.MAX_VALUE;
			for(int x : dp[R-1])
				min = Math.min(min, x);
			System.out.println(min);
		}
	}

	private static int[][] floyd(int[][] map){
		int n = map.length;
		int[][] c = new int[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				c[i][j] = map[i][j];
			}
		}

		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i == j || c[i][k] == 0 || c[k][j] == 0) continue;
					else if(c[i][j] == 0 || c[i][j] > c[i][k] + c[k][j]){
						c[i][j] = c[i][k] + c[k][j];
					}
				}
			}
		}

		return c;
	}
}