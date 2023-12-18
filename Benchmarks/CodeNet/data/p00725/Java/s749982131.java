import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		while(w != 0 && h != 0){
			int sx = -1;
			int sy = -1;
			int[][] tile = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					tile[i][j] = sc.nextInt();
					if(tile[i][j] == 2){
						sy = i;
						sx = j;
					}
				}
			}
			System.out.println(func(tile, sx, sy, 1));
			w = sc.nextInt();
			h = sc.nextInt();
		}
		
		sc.close();
	}
	static int func(int[][] tile, int x, int y, int n){
		if(n > 10){
			return -1;
		}
		int[] mx = {0, 0, 1,-1};
		int[] my = {1,-1, 0, 0};
		int res = -1;
		for(int i = 0; i < 4; i++){
			int tx = x + mx[i];
			int ty = y + my[i];
			if(tx >= 0 && tx < tile[0].length && ty >= 0 && ty < tile.length && tile[ty][tx] != 1){
				while(tx >= 0 && tx < tile[0].length && ty >= 0 && ty < tile.length){
					if(tile[ty][tx] == 3){
						return n;
					}
					if(tile[ty][tx] == 1){
						tile[ty][tx] = 0;
						int tmp = func(tile, tx - mx[i], ty - my[i], n + 1);
						if(res == -1 || res > tmp && tmp != -1){
							res = tmp;
						}
						tile[ty][tx] = 1;
						break;
					}
					tx = tx + mx[i];
					ty = ty + my[i];
				}
			}
		}
		return res;
	}
}