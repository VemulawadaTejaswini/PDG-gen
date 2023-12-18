import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, H;
	static char[][] field;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		W = sc.nextInt();
		H = sc.nextInt();
		if(W == 0 && H == 0)return false;
		
		field = new char[H][W];
		
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == '@')dfs(j, i);
			}
		}
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == '*')res++;
			}
		}
		System.out.println(res);
	}
	
	static void dfs(int x, int y){
		field[y][x] = '*';
		for(int i = 0; i < 4; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(0 <= nx && nx < W && 0 <= ny && ny < H && field[ny][nx] == '.'){
				dfs(nx, ny);
			}
		}
	}

}