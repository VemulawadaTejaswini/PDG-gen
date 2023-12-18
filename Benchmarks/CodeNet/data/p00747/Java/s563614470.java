import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	static int h;
	static int w;
	static int[][] xWall;
	static int[][] yWall;
	static boolean[][] isVisited;
	//右、左、下、上
	static int[][] steps = {{0,1},{0,-1},{1,0},{-1,0}};
	static int ans;


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			 w= sc.nextInt();
			 h = sc.nextInt();

			if((w|h) == 0) {
				break;
			}

			xWall = new int[h][w-1];
			yWall = new int[h][w];

			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w-1; j++) {
					xWall[i][j] = sc.nextInt();
				}
				if(i!=h-1) {
					for(int j = 0; j < w; j++) {
						yWall[i][j] = sc.nextInt();
					}
				}
			}


			isVisited = new boolean[h][w];
			isVisited[0][0] = true;

			ArrayDeque<int[]> q = new ArrayDeque<int[]>();
			int[] start = {0,0,1};
			q.add(start);

			ans= 0;

			while(!q.isEmpty()) {
				int[] nowSquare = q.poll();

				int nowH = nowSquare[0];
				int nowW = nowSquare[1];

				if(nowH == h-1 && nowW == w-1) {
					ans = nowSquare[2];
					break;
				}

				for(int i = 0; i < 4; i++) {
					if(! isAvailable(nowSquare, i) || isVisited[nowH + steps[i][0]][nowW + steps[i][1]] == true) {
						continue;
					}
					isVisited[nowH + steps[i][0]][nowW + steps[i][1]] = true;
					int distance = nowSquare[2];
					int[] nextSquare = {nowH + steps[i][0], nowW + steps[i][1], distance+1 };

					q.add(nextSquare);
				}
			}

			System.out.println(ans);
		}

	}

	static boolean isAvailable(int[] nowSquare, int idx) {
		boolean isAvalable = false;
		int nowH = nowSquare[0];
		int nowW = nowSquare[1];

		switch(idx) {
		//右
		case 0:
			if(nowW +1 > w-1 || xWall[nowH][nowW] ==1) {
				return false;
			}else{return true;}
			//左
		case 1:
			if(nowW -1 < 0 || xWall[nowH][nowW-1] ==1) {
				return false;
			}else{return true;}
			//下
		case 2:
			if(nowH +1 > h-1 || yWall[nowH][nowW] ==1) {
				return false;
			}else{return true;}
			//上
		case 3:
			if(nowH -1 < 0 || yWall[nowH-1][nowW] ==1) {
				return false;
			}else{return true;}

		default: return false;
		}
	}
}
