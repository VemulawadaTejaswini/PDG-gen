import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] field;
	static int h, w, res;
	static int[] dx = {1, 0, -1, 0}, dy = {0, -1, 0, 1};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0 && h == 0)return false;
		
		field = new int[h][w];
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				field[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == 2)dfs(j, i, 0);
			}
		}
		System.out.println(res);
	}
	
	static void dfs(int x, int y, int round){
		if(round >= 10){
			res = -1;
			return;
		}
		for(int i = 0; i < dx.length && i < dy.length; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] != 1){
				if(field[ny][nx] == 3){
					res = round;
					return;
				}
				boolean out_of_field = false;
				while(true){
					nx = nx + dx[i]; ny = ny + dy[i];
					if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length){
						if(field[ny][nx] == 3){
							res = round;
							return;
						}
						if(field[ny][nx] == 1){
							field[ny][nx] = 0;
							break;
						}
					}else{
						out_of_field = true;
						break;
					}
				}
				if(out_of_field)continue;
				dfs(nx, ny, round);
				field[ny][ny] = 1;
			}
		}		
	}

	static void print(int[][]f){
		for(int i = 0; i < f.length; i++){
			for(int j = 0; j < f[0].length; j++){
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
	}
}