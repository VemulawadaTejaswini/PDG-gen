import java.util.*;
public class Main { 
	public static int[][] list;
	public static boolean[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			if(w == 0 && h == 0) break;
			list = new int[h][w];
			map = new boolean[2 * h -1][w];
			for(int i = 0; i < list.length; i++) {
				for(int j = 0; j < list[i].length; j++) {
					list[i][j] = 999999;
				}
			}
			for(int i = 0; i < 2 * h - 1; i++) {
				if(i % 2 == 1) {
					for(int j = 0; j < w; j++) {
						int a = stdIn.nextInt();
						if(a == 1) {
							map[i][j] = true;
						}
					}
				}
				else {
					for(int j = 0; j < w - 1; j++) {
						int a = stdIn.nextInt();
						if(a == 1) {
							map[i][j] = true;
						}
					}
				}
			}
			solv(0,0,1);
			int ans = list[list.length-1][list[0].length-1];
			if(ans == 999999) {
				System.out.println(0);
			}
			else {
				System.out.println(ans);
			}
			
		}
		
	}
	
	public static void solv(int x, int y, int c) {
		if(x < 0 || y < 0 || y >= list.length || x >= list[y].length) return;
		if(list[y][x] <= c) return;
		
		
		list[y][x] = c;
		if(x-1 >= 0 && !map[y*2][x-1]) {
			solv(x-1,y,c+1);
		}
		if(x < map[y*2].length && !map[y*2][x]) {
			solv(x+1,y,c+1);
		}
		if(y*2 + 1 < map.length && !map[y*2 + 1][x]) {
			solv(x,y+1,c+1);
		}
		if(y*2 - 1 >= 0 && y * 2 - 1 < map.length &&  !map[y*2-1][x] ) {
			solv(x,y-1,c+1);
		}
	}
	
}