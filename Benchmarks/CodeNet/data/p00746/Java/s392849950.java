import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if(n==0) break;
			boolean[][] map = new boolean[n * 2 + 1][n * 2 + 1];
			int[][] pos = new int[n + 1][2];
			pos[0][0] = n;
			pos[0][1] = n;
			map[pos[0][0]][pos[0][1]] = true;
			for (int i = 1; i < n; i++) {
				int index = sc.nextInt();
				int dir = sc.nextInt();
				int[] dx = { -1, 0, 1, 0 };
				int[] dy = { 0, -1, 0, 1 };
				pos[i][0] = pos[index][0] + dx[dir];
				pos[i][1] = pos[index][1] + dy[dir];
				map[pos[i][0]][pos[i][1]] = true;
			}
			int mini = n * 2 + 1;
			int maxi = 0;
			int minj = n * 2 + 1;
			int maxj = 0;
			for (int i = 0; i < n * 2 + 1; i++) {
				for (int j = 0; j < n * 2 + 1; j++) {
					if (map[i][j]) {
						if (mini > i)
							mini = i;
						if (minj > j)
							minj = j;
						if (maxi < i)
							maxi = i;
						if (maxj < j)
							maxj = j;
					}
				}
			}
			System.out.println((maxi - mini+1) + " " + (maxj - minj+1));
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}