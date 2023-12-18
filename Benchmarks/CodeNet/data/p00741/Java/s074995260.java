import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int width = 0;
		int height = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true){
			//マップの大きさを取得
			width = sc.nextInt();
			height = sc.nextInt();
			int count = 0;
			
			//終了条件の判定
			if (width == 0 && height == 0){
				break;	
			}
			
			//マップ用変数
			int[][] map = new int[height + 2][width + 2];
			
			//番兵を配置
			for (int i = 0; i < width + 2; i++){
				map[0][i] = 0;
				map[height + 1][i] = 0;
			}
			for (int i = 1; i < height + 1; i++){
				map[i][0] = 0;
				map[i][width + 1] = 0;
			}
			
			//データを入力
			for (int i = 1; i <= height; i++){
				for (int j = 1; j <= width; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 1; i <= height; i++){
				for (int j = 1; j <= width; j++){
					if (map[i][j] == 1){
						count++;
						map[i][j] = 0;
						remover(i,j,map);
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
	private static void remover(int h, int w, int[][] map){
		int choice[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
			
		for (int i = 0; i < 8; i++){
			if (map[choice[i][0] + h][choice[i][1] + w] == 1){
				map[choice[i][0] + h][choice[i][1] + w] = 0;
				remover(choice[i][0] + h, choice[i][1] + w,map);
			}
		}
	}
}
