

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int W = 8;
	static final int H = 8;
	static char[][] board = new char[W + 2][H + 2];

	static int[] vx = {0,1,1,1,0,-1,-1,-1};
	static int[] vy = {1,1,0,-1,-1,-1,0,1};

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < board.length; i++){
			Arrays.fill(board[i], '.');
		}

		for(int i = 1; i <= H; i++){
			String str = sc.next();

			for(int j = 1; j <= W; j++){
				board[i][j] = str.charAt(j - 1);
			}
		}

		Player[] players = new Player[2];

		players[0] = new Player('o', 'x');
		players[1] = new Player('x', 'o');

		int pid = 0;

		while(true){
			Player current = players[pid%players.length];

			int tmpMax = 0;
			int maxX = 0;
			int maxY = 0;

			//最適な場所を探す
			for(int i = 1; i <= H; i++){
				for(int j = 1; j <= W; j++){
					if(board[i][j] != '.'){
						continue;
					}
					int tmpCount = countReversible(current, j, i);
//					System.out.println(tmpCount);

					if((pid%players.length == 0 &&  tmpMax < tmpCount) ||
							pid%players.length == 1 && tmpMax <= tmpCount){
						tmpMax = tmpCount;
						maxX = j;
						maxY = i;
					}
				}
			}

			if(tmpMax != 0){
//				System.out.println("put at "+maxX+", "+maxY+" expect "+tmpMax);
				reverse(current, maxX, maxY);
				current.put = true;
			}
			else {
//				System.out.println("cant fount");
				current.put = false;
			}
			pid++;

			if(!players[0].put && !players[1].put){
				break;
			}
//			printBoard();
//			System.out.println();
//			sc.next();
		}

		printBoard();
	}

	static void printBoard (){
		for(int i = 1; i <= H; i++){
			for(int j = 1; j <= W; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	static int countReversible(Player player, int x, int y){
		int count = 0;

//		board[y][x] = player.piece;
		for(int i = 0; i < 8; i++){
			if(board[y + vy[i]][x + vx[i]] == player.enemy){
				int j = 1;
				while(board[y + vy[i]*j][x + vx[i]*j] != '.'){
					if(board[y + vy[i]*j][x + vx[i]*j] == player.piece){
						count += j - 1;
						break;
					}

					j++;
				}
			}
		}

		return count;
	}

	static void reverse(Player player, int x, int y){
		board[y][x] = player.piece;
		for(int i = 0; i < 8; i++){
			boolean reversible = false;
			if(board[y + vy[i]][x + vx[i]] == player.enemy){
				int j = 1;
				while(board[y + vy[i]*j][x + vx[i]*j] != '.'){
					if(board[y + vy[i]*j][x + vx[i]*j] == player.piece){
						reversible = true;
						break;
					}

					j++;
				}
			}

			if(reversible){
//				System.out.println("dir "+i);
				int j = 1;
				while(board[y + vy[i]*j][x + vx[i]*j] == player.enemy){
					board[y + vy[i]*j][x + vx[i]*j] = player.piece;
					j++;
				}
			}
		}
	}

}

class Player {
	char piece;
	char enemy;
	boolean put = true;

	Player(char piece, char enemy){
		this.piece = piece;
		this.enemy = enemy;
	}
}
