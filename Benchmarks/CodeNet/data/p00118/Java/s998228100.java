import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] field;
	static int H, W;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		H = sc.nextInt();
		W = sc.nextInt();
		if(H == 0 && W == 0)return false;
		
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
				if(field[i][j] != 'x' ){
					dfs(i, j);
					res++;
				}
			}
		}
		
		System.out.println(res);
	}
	
	static void dfs(int x, int y){
		char mark = field[x][y];
		field[x][y] = 'x';
		for(int i = 0; i < dx.length; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0 <= nx && nx < field.length && 0 <= ny && ny < field[0].length && field[nx][ny] == mark){
				dfs(nx, ny);
			}
		}
	}
}