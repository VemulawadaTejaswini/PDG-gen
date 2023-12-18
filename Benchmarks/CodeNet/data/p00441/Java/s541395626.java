import java.util.*;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] listX = new int[n];
			int[] listY = new int[n];
			boolean[][] map = new boolean[5001][5001];
			for (int i = 0; i < n; i++) {
				listX[i] = sc.nextInt();
				listY[i] = sc.nextInt();
				map[listY[i]][listX[i]] = true;
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int tx = listX[j] - listX[i];
					int ty = listY[j] - listY[i];

					int ax = listX[j] + ty;
					int ay = listY[j] - tx;

					int bx = listX[i] + ty;
					int by = listY[i] - tx;
					if (rCheck(ax, ay) && map[ay][ax] && rCheck(bx, by)
							&& map[by][bx]) {
						max = (int) Math.max(max, (int)Math.pow(
								(listX[i] - listX[j]), 2)
								+ Math.pow((listY[i] - listY[j]), 2));
					}
				}
			}
			System.out.println(max);
		}
	}
	
	static boolean rCheck(int x, int y) {
		if(x < 0 || y < 0 || x > 5000 || y > 5000) return false;
		return true;
	}
	
	static boolean sCheck(int x, int y, int x1, int y2) {
		if(x == x1 && y == y2) return false;
		return true;
	}
	
	static boolean check(int x, int y, int x1, int y1) {
		if(!rCheck(x,y)) return false;
		if(sCheck(x,y,x1,y1)) return false;
		return true;
	}


}