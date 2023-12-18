import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, h;
		int x, y;
		while(true){
			x = 0;
			y = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			Game game = new Game(w, h);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					game.map[i][j] = sc.nextInt();
					if(game.map[i][j] == 2){
						x = i;
						y = j;
					}
				}
			}
			game.search(x, y, 0);
			System.out.println(game.answer <= 10 ? game.answer : -1);
		}
	}
}
class Game{
	int answer = 11;
	int w, h;
	int[][] map;
	int[][] v = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		map = new int[h][w];
	}
	boolean isInRange(int x, int y){
		return (x >= 0 && x < h && y >= 0 && y < w);
	}
	void search(int x, int y, int k){
		if(k >= answer)
			return;
		int p, q;
		for(int i = 0; i < v.length; i++){
			p = x + v[i][0];
			q = y + v[i][1];
			if(!isInRange(p, q) || map[p][q] == 1)
				continue;
			while(isInRange(p, q)){
				if(map[p][q] == 1){
					map[p][q] = 0;
					search(p-v[i][0], q-v[i][1], k+1);
					map[p][q] = 1;
					break;
				}
				if(map[p][q] == 3){
					if(k+1 < answer)
						answer = k + 1;
					break;
				}
				p += v[i][0];
				q += v[i][1];
			}
		}
		return;
	}
}