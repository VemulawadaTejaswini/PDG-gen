import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		// オリジナルのマス目をString型配列gridとする
		String[][] grid = new String[h][w];
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			
			for(int n = 0; n < w; n++) {
				grid[i][n] = s.substring(n, n + 1);
			}
			
		}
		
		// #を1に.を0に変換し、新しいint型配列checkGridに格納する
		int[][] checkGrid = new int[h][w];
		for(int i = 0; i < h; i++) {
			
			for(int n = 0; n < w; n++) {
				if(grid[i][n].equals("#")) {
					checkGrid[i][n] = 1;
				}else {
					checkGrid[i][n] = 0;
				}
			}
		}
		
		/* 
		 * 行チェック
		 * 全てがドットであれば当該行の数をすべて足しても0
		 * 後の条件分岐のため合計が0＝取り除く行の番号をdelGyoに格納 
		 */
		int[] delGyo = new int[h];
		for(int i = 0; i < h; i++) {
			
			int gyoSum = 0;
			for(int n = 0; n < w; n++) {
				gyoSum += checkGrid[i][n];
				
			}
			
			if(gyoSum == 0) {
				delGyo[i] = 0;
			}else {
				delGyo[i] = 1;
			}
			
		}
		
		// 列チェック＝行チェック同様
		int[] delRetsu = new int[w];
		for(int i = 0; i < w; i++) {
			
			int retsuSum = 0;
			for(int n = 0; n < h; n++) {
				retsuSum += checkGrid[n][i];
				
			}
			
			if(retsuSum == 0) {
				delRetsu[i] = 0;
			}else {
				delRetsu[i] = 1;
			}
			
		}
		
		/*
		 * delGyoから、取り除く行であればcontinue
		 * 取り除く行でない場合はdelRetsuで取り除く列か調べる
		 * 両方をクリアしたものだけ表示する
		 */
		for(int i = 0; i < h; i++) {
			if(delGyo[i] == 0) {
				continue;
			}else {
				
				for(int n = 0; n < w; n++) {
					if(delRetsu[n] == 0) {
						continue;
					}else {
						System.out.print(grid[i][n]);
					}
					
				}
				
				System.out.println("");
			}
			
		}
	}

}
