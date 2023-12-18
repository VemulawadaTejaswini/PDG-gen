import java.util.*;
public class Main {
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			if(w == 0 && h == 0) break;
			map = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					int a = stdIn.nextInt();
					map[i][j] = (a == 1)?true:false;
				}
			}
			int counter = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j]) {
						counter++;
						sorv(i,j);
					}
					
				}
			}
			System.out.println(counter);
			
		}
	}
	
	static void sorv(int i, int j) {
		if(i < 0 || j < 0)return;
		if(i >= map.length || j >= map[i].length)return;
		if(!map[i][j])return;
		if(map[i][j]) map[i][j] = false;
		sorv(i-1,j-1);
		sorv(i-1,j);
		sorv(i-1,j+1);
		sorv(i,j+1);
		sorv(i,j-1);
		sorv(i+1,j-1);
		sorv(i+1,j);
		sorv(i+1,j+1);
	}
}