import java.util.*;
public class Main {

	public static void main (String[] args) {
		new Main().calc();
	}

	int[] moveX = {0,0,-1,1};
	int[] moveY = {-1,1,0,0};
	char[][] map;
	boolean[][] check;
	int ans = 0;
	int w, h;

	void calc () {
		// 同じScanner型の変数にnewで代入するのはどうもまずい
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (w == 0) break;
			ans = 0;
			map = new char[h][w];
			check = new boolean[h][w];
			for (int i = 0; i < h; i++)
				map[i] = sc.next().toCharArray();

			bfs();

			System.out.println(ans);
		}
	}

	void bfs () {

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (check[i][j]) continue;
				check[i][j] = true;
				ans++;

				Queue<Integer> queueX = new LinkedList<Integer>();
				Queue<Integer> queueY = new LinkedList<Integer>();
				queueX.add(j);
				queueY.add(i);

				while (!queueX.isEmpty()) {
					int x = queueX.poll();
					int y = queueY.poll();
					for (int k = 0; k < moveX.length; k++) {
						int nextX = x + moveX[k];
						int nextY = y + moveY[k];

						if (0 <= nextX && nextX < w &&
							0 <= nextY && nextY < h &&
							!check[nextY][nextX] &&
							map[i][j] == map[nextY][nextX]) {

							check[nextY][nextX] = true;
							queueX.add(nextX);
							queueY.add(nextY);

						}

					}
				}
			}
		}

	}

}