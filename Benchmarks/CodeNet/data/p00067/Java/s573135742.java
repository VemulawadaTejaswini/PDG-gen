import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			map = new int[12][12];
			for (int i = 0; i < map.length; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < map.length; j++) {
					map[i][j] = line.charAt(j) - '0';
				}
			}
			
			int cnt = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] != 0) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			sc.nextLine();
		}
	}
	
	private void dfs(int x, int y) {
		if ((x < 0) || (x >= map.length) || (y < 0) || (y >= map.length)) return;
		if (map[x][y] == 0) return;
		map[x][y] = 0;

		dfs(x - 1, y);
		dfs(x + 1, y);
		dfs(x, y - 1);
		dfs(x, y + 1);
	}
}