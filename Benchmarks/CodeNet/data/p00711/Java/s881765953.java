import java.util.Scanner;

public class Main {
	int H, W;
	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			W = sc.nextInt();
			H = sc.nextInt();
			if((H | W) == 0){
				break;
			}
			sc.nextLine();
			char[][] field = new char[H][W];
			for(int i = 0; i < H; ++i){
				field[i] = sc.nextLine().toCharArray(); 
			}
			for(int i = 0; i < H; ++i){
				for(int j = 0; j < W; ++j){
					if(field[i][j] == '@'){
						System.out.println(dfs(field, i, j));
					}
				}
			}
		}
	}
	int dfs(char[][] field, int y, int x){
		if(y < 0 || H <= y || x < 0 || W <= x){
			return 0;
		}
		if(field[y][x] == '#'){
			return 0;
		}
		field[y][x] = '#';
		int ret = 0;
		for(int i = 0; i < 4; ++i){
			ret += dfs(field, y+dy[i], x+dx[i]);
		}
		return ret+1;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}