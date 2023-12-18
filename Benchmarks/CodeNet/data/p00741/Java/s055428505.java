import java.util.Scanner;

public class Main {
	public static void recDelIsland(boolean[][] map, int i, int j){
		map[i][j] = false;
		for(int di = -1; di <= 1; di++){
			for(int dj = -1; dj <= 1; dj++){
				if((di != 0 || dj != 0) &&
					di + i >= 0 && di + i < map.length &&
					dj + j >= 0 && dj + j < map[0].length &&
					map[di + i][dj + j]){
					recDelIsland(map, di + i, dj + j);
				}
			}
		}
	}
	public static int getNumOfIslands(boolean[][] map){
		int result = 0;
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; j++){
				if(map[i][j]){
					result++;
					recDelIsland(map, i, j);
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int w, h;
		w = scn.nextInt();
		h = scn.nextInt();
		while(w != 0 || h != 0){
			boolean[][] map = new boolean[h][w];
			for(int i = 0; i < h; i++)	for(int j = 0; j < w; j++)	map[i][j] = (scn.nextInt() == 1);
			System.out.println(getNumOfIslands(map));
			w = scn.nextInt();
			h = scn.nextInt();
		}
	}
}