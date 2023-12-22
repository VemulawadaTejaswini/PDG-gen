import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] table = new int[h][w];

		for (int i = 0; i < h; i++) {
			String aLine = sc.next();
			String[] aArray = aLine.split("");
			for (int j = 0; j < w; j++) {
				String a = aArray[j];
				table[i][j] = a.equals("#") ? 0 : h * w;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int leftValue = j > 0 ? table[i][j - 1] + 1 : table[i][j];
				int topValue = i > 0 ? table[i - 1][j] + 1 : table[i][j];
				table[i][j] = Math.min(Math.min(leftValue, topValue), table[i][j]);
			}
			for (int j = w - 1; j >= 0; j--) {
				int rightValue = j < w - 1 ? table[i][j + 1] + 1 : table[i][j];
				table[i][j] = Math.min(rightValue, table[i][j]);
			}
			// System.out.println();
		}
		for (int i = h - 1; i >= 0; i--) {
			for (int j = 0; j < w; j++) {
				int leftValue = j > 0 ? table[i][j - 1] + 1 : table[i][j];
				int bottomValue = i < h - 1 ? table[i + 1][j] + 1 : table[i][j];
				table[i][j] = Math.min(Math.min(leftValue, bottomValue), table[i][j]);
			}
			for (int j = w - 1; j >= 0; j--) {
				int rightValue = j < w - 1 ? table[i][j + 1] + 1 : table[i][j];
				table[i][j] = Math.min(rightValue, table[i][j]);
			}
			// System.out.println();
		}

		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				count = Math.max(count, table[i][j]);
			}
		}
		System.out.println(count);

	}
}