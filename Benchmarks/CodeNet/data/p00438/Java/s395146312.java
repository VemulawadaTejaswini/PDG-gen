import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) break;
			int[][] path = new int[h][w];
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				path[y][x] = -1;
			}
			
			for (int i = 0; i < h; i++)
				path[i][0] = path[i][0] == 0 ? 1 : path[i][0];
			for (int i = 0; i < w; i++)
				path[0][i] = path[0][i] == 0 ? 1 : path[0][i];
			for (int i = 1; i < h; i++) {
				for (int j = 1; j < w; j++) {
					if (path[i][j] == -1) continue;
					int a = path[i - 1][j] == -1 ? 0 : path[i - 1][j];
					int b = path[i][j - 1] == -1 ? 0 : path[i][j - 1];
					path[i][j] = a + b;
				}
			}
			System.out.println(path[h - 1][w - 1]);
		}
		
	}
	
}