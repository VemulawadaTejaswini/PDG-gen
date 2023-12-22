import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[][] field = new int[h][w];
		int hIdx = 0;
		int wIdx = 0;
		for (int i = 0; i < n; i++) {
			while (arr[i] > 0) {
				field[hIdx][wIdx] = i + 1;
				if (hIdx % 2 == 0) {
					if (wIdx == w - 1) {
						hIdx++;
					} else {
						wIdx++;
					}
				} else {
					if (wIdx == 0) {
						hIdx++;
					} else {
						wIdx--;
					}
				}
				arr[i]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(field[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
