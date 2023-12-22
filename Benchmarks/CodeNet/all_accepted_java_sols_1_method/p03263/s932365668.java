import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];

		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		List<int[]> answer = new ArrayList<>();

		boolean carrying = false;
		for (int i = 0; i < h; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < w; j++) {
					if (a[i][j] % 2 == 1) {
						if (carrying) {
							if (j == 0) {
								answer.add(new int[]{i, 1, i + 1, 1});
							} else {
								answer.add(new int[]{i + 1, j, i + 1, j + 1});
							}
							carrying = false;
						} else {
							carrying = true;
						}
					} else {
						if (carrying) {
							if (j == 0) {
								answer.add(new int[]{i, 1, i + 1, 1});
							} else {
								answer.add(new int[]{i + 1, j, i + 1, j + 1});
							}
						}
					}

				}
			} else {
				for (int j = w - 1; j >= 0; j--) {
					if (a[i][j] % 2 == 1) {
						if (carrying) {
							if (j == w - 1) {
								answer.add(new int[]{i, w, i + 1, w});
							} else {
								answer.add(new int[]{i + 1, j + 2, i + 1, j + 1});
							}
							carrying = false;
						} else {
							carrying = true;
						}
					} else {
						if (carrying) {
							if (j == w - 1) {
								answer.add(new int[]{i, w, i + 1, w});
							} else {
								answer.add(new int[]{i + 1, j + 2, i + 1, j + 1});
							}
						}
					}
				}
			}
		}
		System.out.println(answer.size());
		StringBuilder sb = new StringBuilder();
		for (int[] x : answer) {
			sb.append(x[0]);
			sb.append(" ");
			sb.append(x[1]);
			sb.append(" ");
			sb.append(x[2]);
			sb.append(" ");
			sb.append(x[3]);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
