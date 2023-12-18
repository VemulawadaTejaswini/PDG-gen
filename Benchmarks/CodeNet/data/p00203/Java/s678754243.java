import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int x, y;
	static int[][] field, dp;
	static int[] dx = {-1, 0, 1}, dy = {1};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0)return false;
		
		field = new int[y+2][x];
		dp = new int[y+2][x];
		
		for(int i = 0; i < field.length-2; i++){
			for(int j = 0; j < field[0].length; j++){
				field[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		for(int i = 0; i < field[0].length; i++){
			if(field[0][i] == 0)dp[0][i] = 1;
		}
		
		for(int y = 0; y < field.length-3; y++){
			for(int x = 0; x < field[0].length; x++){
				if(field[y][x] == 0){
					for(int k = 0; k < dx.length; k++){
						int nx = x + dx[k], ny = y + 1;
						if(0 > nx || nx >= field[0].length)continue;
						if(field[ny][nx] == 0)dp[ny][nx] += dp[y][x];
					}
				}else if(field[y][x] == 2){
					int ny = y + 2, nx = x;
					while(true){
						dp[ny][nx] += dp[y-1][x];
						if(field[ny][nx] != 2)break;
						ny = ny + 2;
					}
				}else if(field[y][x] == 1){
					dp[y][x] = 0;
				}
			}
		}
		int res = 0;
		for(int x = 0; x < dp[0].length; x++){
			res += dp[dp.length-1][x] + dp[dp.length-2][x] + dp[dp.length-3][x];
		}
		System.out.println(res);
		//printDP();
	}
	
	static void printDP(){
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
}