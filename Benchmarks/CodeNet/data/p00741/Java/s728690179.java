import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void seek(int x, int y, int[][] map){
		if(map[y][x] == 1){
			map[y][x] = 0;
			seek(x+1, y+1, map);
			seek(x  , y+1, map);
			seek(x-1, y+1, map);
			seek(x+1, y  , map);
			seek(x-1, y  , map);
			seek(x+1, y-1, map);
			seek(x  , y-1, map);
			seek(x-1, y-1, map);
		}
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int[][] map = new int[h+2][w+2];

			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = 0;
				}
			}
			
			for(int i = 1; i < h+1; i++){
				for(int j = 1; j < w+1; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			for(int i = 1; i < h+1; i++){
				for(int j = 1; j < w+1; j++){
					if(map[i][j] == 1){
						seek(j,i,map);
						count++;
					}
				}
			}
			
			System.out.println(count);
			
		}
	}

}