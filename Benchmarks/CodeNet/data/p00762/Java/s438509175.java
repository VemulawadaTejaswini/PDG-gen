import java.util.Scanner;

public class Main {

	// {0top, 1bottom, 2front, 3right, 4back, 5left}
	private static int[][] dices = { { 1, 6, 5, 4, 2, 3 }, { 2, 5, 4, 6, 3, 1 }, { 3, 4, 6, 5, 1, 2 } };
	private static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			int[][] height = new int[n * 2 + 1][n * 2 + 1];
			int[][] map = new int[n * 2 + 1][n * 2 + 1];
			for (int i = 0; i < n; i++) {
				int top = sc.nextInt();
				int front = sc.nextInt();
				int[] dice = new int[6];
				for (int j = 0; j < dices.length; j++) {
					if (top != dices[j][0] && top == dices[j][1]) {
						// ひっくり返す
						dice[0] = dices[j][1];
						dice[1] = dices[j][0];
						dice[2] = dices[j][5];
						dice[3] = dices[j][4];
						dice[4] = dices[j][3];
						dice[5] = dices[j][2];
					} else if (top == dices[j][0]) {
						// そのまま使う
						for (int k = 0; k < dice.length; k++) {
							dice[k] = dices[j][k];
						}
					} else {
						continue;
					}
				}
				for (int j = 2; j <= 5; j++) {
					if (dice[j] == front) {
						int back = dice[j % 4 + 2];
						int k = (j - 1) % 4 + 2;
						int right = dice[k];
						int left = dice[k % 4 + 2];

						dice[2] = front;
						dice[3] = right;
						dice[4] = back;
						dice[5] = left;
					}
				}

				int[] now = { n, n };// {前後, 左右}
				while (true) {
					int num = 0;
					int direction = -1;
					for (int j = 0; j < dir.length; j++) {
						if (height[now[0] + dir[j][0]][now[1] + dir[j][1]] < height[now[0]][now[1]] && dice[j + 2] >= 4) {
							// ころがりおちることができるとき
							if (num < dice[j + 2]) {
								num = dice[j + 2];
								direction = j;
							}
						}
					}
					if (direction == -1) {
						// 転がり落ちれない時
						map[now[0]][now[1]] = dice[0];
						height[now[0]][now[1]]++;
						break;
					} else {
						now[0] += dir[direction][0];
						now[1] += dir[direction][1];

						if (direction == 0) {
							// 前に転がる
							int[] newdice = { dice[4], dice[2], dice[0], dice[3], dice[1], dice[5] };
							for (int j = 0; j < newdice.length; j++) {
								dice[j] = newdice[j];
							}
						} else if (direction == 1) {
							// 右に転がる
							int[] newdice = { dice[5], dice[3], dice[2], dice[0], dice[4], dice[1] };
							for (int j = 0; j < newdice.length; j++) {
								dice[j] = newdice[j];
							}
						} else if (direction == 2) {
							// 後ろに転がる
							int[] newdice = { dice[2], dice[4], dice[1], dice[3], dice[0], dice[5] };
							for (int j = 0; j < newdice.length; j++) {
								dice[j] = newdice[j];
							}
						} else {
							// 左に転がる
							int[] newdice = { dice[3], dice[5], dice[2], dice[1], dice[4], dice[0] };
							for (int j = 0; j < newdice.length; j++) {
								dice[j] = newdice[j];
							}
						}
					}
				}

			}

			int[] cnt = new int[6];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] > 0) {
						cnt[map[i][j] - 1]++;
					}
				}
			}
			for (int i = 0; i < cnt.length; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(cnt[i]);
			}
			System.out.println();
		}
	}
}