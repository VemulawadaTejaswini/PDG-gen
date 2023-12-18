import java.util.Scanner;

public class Main {
	static final int CHECK = 0;
	static final int RINGO = 1;
	static final int KAKI  = 2;
	static final int MIKAN = 3;
	
	char[][] field;
	int h, w, fruit;

	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (h + w == 0)
				break;
			field = new char[h][];
			for (int i = 0; i < h; i++) {
				field[i] = new char[w];
				char[] f = scan.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (f[j] == '@')
						field[i][j] = RINGO;
					else if (f[j] == '#')
						field[i][j] = KAKI;
					else
						field[i][j] = MIKAN;
				}
			}
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (field[i][j] != CHECK) {
						ans++;
						fruit = field[i][j];
						bfs(i, j);
					}
				}
			}
			System.out.println(ans);
		}
	}

	void bfs(int y, int x) {
		if (y < 0 || x < 0 || y >= h || x >= w || field[y][x] != fruit)
			return;
		field[y][x] = CHECK;

		bfs(y + 1, x + 0);
		bfs(y + -1, x + 0);
		bfs(y + 0, x + 1);
		bfs(y + 0, x + -1);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}