import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	public boolean[][] map;
	
	Main(boolean[][] map) {
		this.map = map;
	}
		
	int solve(int y, int x) {
		if (y < 0 || x < 0 || y >= h || x >= w || !map[y][x]) return 0;
		map[y][x] = false;
		return solve(y + 1, x) + solve(y - 1, x) + solve(y, x + 1) + solve(y, x - 1) + 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) break;
			boolean[][] room = new boolean[h][];
			int y = 0;
			int x = 0;
			scan.nextLine();
			for (int i = 0; i < h; i++)
				room[i] = new boolean[w];
			for (int i = 0; i < h; i++) {
				String str = scan.nextLine();
				for (int j = 0; j < w; j++) {
					switch (str.charAt(j)) {
						case '.': room[i][j] = true; break;
						case '#': room[i][j] = false; break;
						case '@':
							room[i][j] = true;
							y = i;
							x = j;
							break;
					}
				}
			}
			System.out.println(new Main(room).solve(y, x));
		}
	}
}