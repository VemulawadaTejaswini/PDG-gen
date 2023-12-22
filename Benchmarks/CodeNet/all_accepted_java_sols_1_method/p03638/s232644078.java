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
		int[][] grid = new int[h][w];
		int nowH = 0;
		int nowW = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr[i]; j++) {
				grid[nowH][nowW] = i + 1;
				if (nowH % 2 == 0) {
					if (nowW == w - 1) {
						nowH++;
					} else {
						nowW++;
					}
				} else {
					if (nowW == 0) {
						nowH++;
					} else {
						nowW--;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(grid[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
