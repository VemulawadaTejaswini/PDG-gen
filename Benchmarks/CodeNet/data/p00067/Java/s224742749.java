import java.util.*;
public class Main {
	public static int[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int counter = 0;
			map = new int[12][12];
			for(int i = 0; i < 12; i++) {
				 String tmp = stdIn.next();
				for(int j = 0; j < 12; j++) {
					map[i][j] = Integer.parseInt(String.valueOf(tmp.charAt(j)));
				}
			}
			for(int i = 0; i < 12; i++) {
				for(int j = 0; j < 12; j++) {
					if(map[i][j] == 1) {
						counter++;
						check(i,j);
					}
				}
			}
			System.out.println(counter);
		}
		

	}
	
	public static void check(int x, int y) {
		if(x < 0 || x > 11 || y < 0 || y > 11 || map[x][y] == 0 ) {
			return;
		}
		map[x][y] = 0;
		check(x+1,y);
		check(x-1,y);
		check(x,y+1);
		check(x,y-1);
	}

}