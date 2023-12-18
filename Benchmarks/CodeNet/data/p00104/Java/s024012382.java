package Blog;

import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] d = {'>','<','^','v'};
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};

	public static void main(String[] args) {
		while(sc.hasNext()) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h==0 && w==0) break;
			
			char[][] map = new char[h][w];
			for (int i=0; i<h; i++) {
				String s = sc.next();
				for (int j=0; j<w; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			
			boolean[][] memo = new boolean[h][w];
			int x = 0;
			int y = 0;
			boolean loop = false;
			memo[y][x] = true;
			loop1: while (map[y][x] != '.') {
				for (int i=0; i<4; i++) {
					if (map[y][x]==d[i]) {
						x += dx[i]; y += dy[i];
						if (memo[y][x]) {
							loop = true;
							break loop1;
						}
						else memo[y][x] = true;
					}
				}
			}
			
			out.println(loop?"LOOP":x+" "+y);
		}
	}
}

