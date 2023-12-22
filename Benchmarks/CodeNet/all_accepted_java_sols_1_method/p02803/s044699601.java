import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] vx = {-1,0,1,0};
		int[] vy = {0,1,0,-1};



		int h = stdIn.nextInt();
		int w = stdIn.nextInt();

		char[][] maze = new char[h][w];

		for(int i = 0; i < h; i++) {
			maze[i] = stdIn.next().toCharArray();
		}


		int max = 0;


		//s地点を設定
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(maze[i][j]=='#') {
					continue;
				}
				
				int[][] board = new int[h][w];
				
				for(int a = 0; a < h; a++) {
					for(int b = 0; b < w; b++) {
						board[a][b] = -1;
					}
				}
				
				board[i][j] = 0;
				
				int sx = j;
				int sy = i;

				Queue<Integer> queueX = new LinkedList<>();
				Queue<Integer> queueY = new LinkedList<>();


				queueX.add(sx);
				queueY.add(sy);

				while(!queueX.isEmpty()) {
					int x = queueX.poll();
					int y = queueY.poll();

					for(int k = 0; k < 4; k++) {
						int nextX = x + vx[k];
						int nextY = y + vy[k];

						if(0 <= nextX && nextX < w && 0 <= nextY && nextY < h && maze[nextY][nextX] == '.' 
								&& board[nextY][nextX] == -1) {
							board[nextY][nextX] = board[y][x] + 1;
							queueX.add(nextX);
							queueY.add(nextY);
						}

					}

				}

				for(int l = 0; l < h; l++) {
					for(int m = 0; m < w; m++) {
						max = Math.max(max, board[l][m]);
					}
				}

			}
		}

		System.out.println(max);


	}

}
