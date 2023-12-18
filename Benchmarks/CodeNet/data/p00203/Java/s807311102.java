import java.util.*;
class Main {
	static int[][] map;
	static int x;
	static int y;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			if(x == 0 && y == 0) break;
			map = new int[y+1][x];
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					map[i][j] = stdIn.nextInt();
				}
			}
			int sum = 0;
			for(int i = 0; i < x; i++) {
				sum += solv(y-1,i,false);
				if(y >= 2 && map[y-1][i] == 2) {
					sum += solv(y-1,i,true);
				}
				if(y >= 2 && map[y-2][i] == 2) {
					sum += solv(y-2,i,true);
				}
			}
			System.out.println(sum);
		}
	}
	
	static int solv(int y, int x, boolean jump) {
		int ret = 0;
		
		if(y < 0 || x < 0 || x >= Main.x) return 0;
		
		if(map[y][x] == 1) return 0;
		
		if(map[y][x] == 2 && !jump) return 0;
		if(y == 0) return 1;
		
		if(y >= 2 && map[y-2][x] == 2) {
			ret += solv(y-2,x,true);
		}
		if(!jump) {
		ret += solv(y-1,x-1,false);
		ret += solv(y-1,x+1,false);
		}
		ret += solv(y-1,x,false);
		
		return ret;
	}
}