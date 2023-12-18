import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			w++;
			h++;
			boolean[][] map = new boolean[h][w];
			for(int i = 0; i < n; i++) {
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				map[y][x] = true;
			}
			
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			int count = 0;
			for(int i = 0; i <= h - t; i++) {
				for(int j = 0; j <= w - s; j++) {
					int precount = 0;
					for(int k = 0; k < t; k++) {
						for(int l = 0; l < s; l++) {
							if(map[i+k][j+l]) {
								precount++;
							}
						}
					}
					if(precount > count) {
						count = precount;
					}
				}
			}
			System.out.println(count);
		}
	}
 }