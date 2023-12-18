import java.util.Scanner;


public class Main {
	static Scanner scan = new Scanner(System.in);
	static boolean[][] map = new boolean[12][12];
	static boolean[][] check = new boolean[12][12];
	static int island = 0;
	public static void main(String[] args) {
		while(scan.hasNext()) {
			
			for(int i = 0; i < 12; i++) {
				int count = 0;
				for( String s : scan.nextLine().split("",0)) {
					if(s.equals("1")) {
						map[i][count] = true;
					}
					else {
						map[i][count] = false;
					}
					count++;
				}
			}
			for(int i = 0; i < 12 ; i++) {
				for(int u = 0; u < 12; u++) {
					if(map[i][u] && !check[i][u]) {
						fun(i,u);
					}
				}
			}
		}
	}

	static void fun(int x, int y) {
		fun(x,y,0);
		island++;

	}

	static void fun(int x, int y, int muki) {
		check[x][y] = true;
	
		if(muki == 0) {
			if(y + 1 < 12 && map[x][y+1]) {
				fun(x,y+1,0);
			} else {
				fun(x+1,y,1);
			}
			
		} if(muki == 1) {
			if(x+1 < 12 && map[x+1][y]) {
				fun(x+1,y,1);
			} else {
				fun(x,y-1,2);
			}
		} if(muki == 2) {
			if(y - 1 > - 1 && map[x][y-1]) {
				fun(x,y-1,2);
			} else {
				fun(x+1,y,3);
			}
		} if(muki == 3) {
			if(x - 1 > -1 && map[x-1][y]) {
				fun(x-1,y,3);
			} 			
		}
	}
}