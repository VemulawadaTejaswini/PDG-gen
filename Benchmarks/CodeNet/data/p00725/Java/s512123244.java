import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, h;
		int x, y;
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			Game game = new Game(w, h);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					game.map[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(game.map[i][j] == 2){
						game.move(i, j, 0);
					}
				}
			}
			System.out.println(game.answer <= 10 ? game.answer : -1);
		}
	}

}

class Game{
	int answer = 11;
	int w, h;
	int[][] map;
	int[] dx = new int[]{1, 0, -1, 0};
	int[] dy = new int[]{0, 1, 0, -1};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		map = new int[h][w];
	}
	void move(int x, int y, int k){
		for(int i = 0; i < 4; i++){
			if(x+dx[i] < 0 || x+dx[i] >= h || y+dy[i] < 0 || y+dy[i] >= w)
				continue;
			if(map[x+dx[i]][y+dy[i]] != 1){
				switch(i){
				case 0:
					moveDown(x, y, k);
					break;
				case 1:
					moveRight(x, y, k);
					break;
				case 2:
					moveUp(x, y, k);
					break;
				case 3:
					moveLeft(x, y, k);
					break;
				}
			}
		}
	}
	void moveDown(int x, int y, int k){
		while(true){
			if(map[x+dx[0]][y+dy[0]] == 1){
				map[x+dx[0]][y+dy[0]] = 0;
				move(x, y, ++k);
				break;
			}
			x = x + dx[0];
			y = y + dy[0];
			if(map[x][y] == 3){
				k++;
				if(k < answer)
					answer = k;
				break;
			}
			if(x == h-1)
				break;
		}
	}
	void moveRight(int x, int y, int k){
		while(true){
			if(map[x+dx[1]][y+dy[1]] == 1){
				map[x+dx[1]][y+dy[1]] = 0;
				move(x, y, ++k);
				break;
			}
			x = x + dx[1];
			y = y + dy[1];
			if(map[x][y] == 3){
				k++;
				if(k < answer)
					answer = k;
				break;
			}
			if(y == w-1)
				break;
		}
	}
	void moveUp(int x, int y, int k){
		while(true){
			if(map[x+dx[2]][y+dy[2]] == 1){
				map[x+dx[2]][y+dy[2]] = 0;
				move(x, y, ++k);
				break;
			}
			x = x + dx[2];
			y = y + dy[2];
			if(map[x][y] == 3){
				k++;
				if(k < answer)
					answer = k;
				break;
			}
			if(x == 0)
				break;
		}
	}
	void moveLeft(int x, int y, int k){
		while(true){
			if(map[x+dx[3]][y+dy[3]] == 1){
				map[x+dx[3]][y+dy[3]] = 0;
				move(x, y, ++k);
				break;
			}
			x = x + dx[3];
			y = y + dy[3];
			if(map[x][y] == 3){
				k++;
				if(k < answer)
					answer = k;
				break;
			}
			if(y == 0)
				break;
		}
	}
}