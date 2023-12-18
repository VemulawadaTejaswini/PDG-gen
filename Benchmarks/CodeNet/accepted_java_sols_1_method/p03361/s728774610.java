
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	public static void main(String[] args) {
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		char[][] map = new char[h + 2][w + 2];
		for (int i = 1; i < h + 1; i++) {
			String s = scanner.next();
			for (int j = 0; j < w; j++) {
				map[i][j + 1] = s.charAt(j);
			}
		}
		
		boolean isAchievable = true;
		loop: for (int i = 1; i < h + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				if (map[i][j] =='#') {
					boolean isBlack = false;
					for (int k = 0; k < 4; k++) {
						if (map[i + dy[k]][j + dx[k]] == '#') {
							isBlack = true;
						}
					}
					if (!isBlack) {
						isAchievable = false;
						break loop;
					}
				}
			}
		}
		
		System.out.println(isAchievable?"Yes" : "No");
		
		scanner.close();
	}
}
