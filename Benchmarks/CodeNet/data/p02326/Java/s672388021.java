import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		
		h = sc.nextInt();
		w = sc.nextInt();
		int[][] tiles = new int[h][w], map = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				tiles[i][j] = sc.nextInt();/* ???????????? */
				map[i][j] = -1;/* ?????£????????\??????????????? */
			}
		}
		sc.nextLine();

		int maxS = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w;  j++){
				int ret = search(tiles, i, j, map);
				ret *= ret;
				if(ret > maxS){
					maxS = ret;
				}
			}
		}
		System.out.println(maxS);		
	}
	
	public static int search(int[][] tiles, int i, int j, int[][] map){
		if(tiles[i][j] == 1){
			return 0;
		}else if(map[i][j] != -1){
			return map[i][j];
		}else{
			int ret1, ret2, ret3;
			if(i + 1 < tiles.length && j + 1 < tiles[0].length){
				ret1 = search(tiles, i+1, j, map);
				ret2 = search(tiles, i, j+1, map);
				ret3 = search(tiles, i+1, j+1, map);
			}else{
				return 0;
			}
			if(ret1 != 0 && ret2 != 0 && ret3 != 0){
				map[i][j] = ret1 + 1;
				return map[i][j];
			}else{
				if(ret1 == 0 && ret2 == 0 && ret3 == 0){
					map[i][j] = 1;
					return map[i][j];
				}else{
					map[i][j] = 2;
					return map[i][j];
				}
			}
		}
	}
}