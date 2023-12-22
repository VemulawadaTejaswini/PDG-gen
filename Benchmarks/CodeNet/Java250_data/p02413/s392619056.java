import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] sheet = new int[r+1][c+1];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sheet[i][j] = scan.nextInt();
			}
		}
		
		// 表の端に合計を記録
		int sum_r = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum_r += sheet[i][j];
			}
			sheet[i][c] = sum_r;
			sum_r = 0;
		}
		int sum_c = 0;
		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				sum_c += sheet[i][j];
			}
			sheet[r][j] = sum_c;
			sum_c = 0;
		}
		int sum_all = 0;
		for (int i = 0; i < r; i++) {
			sum_all += sheet[i][c];
		}
		sheet[r][c] = sum_all;
		
		// 出力
		for (int i = 0; i < r+1; i++) {
			output.append(sheet[i][0]);
			for (int j = 1; j < c+1; j++) {
				output.append(" ").append(sheet[i][j]);
			}
			output.append('\n');
		}
		System.out.print(output);
		scan.close();
	}
}