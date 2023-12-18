import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static boolean[][] judge;
	static int[] fieldX = {-1,0,1,0}, 
			fieldY = {0,-1,0,1};
	static void doing(int x, int y) {
		judge[y][x] = false;
		for (int i = 0; i < 4; i++) {
			if (judge[y+fieldY[i]][x+fieldX[i]]) doing(x + fieldX[i], y + fieldY[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while (sc.hasNext()) {
			judge = new boolean[20][20];
			for (int i = 1; i <= 12; i++){
				String temp = sc.next();
				for (int x = 1; x <= 12; x++) {
					judge[i][x] = temp.charAt(x - 1) == '1';
				}
			}
			int cnt = 0;
			for (int i = 1; i <= 12; i++) {
				for (int x = 1; x <= 12; x++) {

					if (judge[i][x]){ cnt++; doing(x, i);
					}

				}
			}
			out.println(cnt);
		}
		out.flush();
	}
}