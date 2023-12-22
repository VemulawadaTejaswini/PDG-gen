import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] spreadsheet = new int[r][c];
		int[][] sumSpreadsheet = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				spreadsheet[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumSpreadsheet[i][j] = spreadsheet[i][j];
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumSpreadsheet[i][c] += sumSpreadsheet[i][j];
			}
		}
		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				sumSpreadsheet[r][j] += sumSpreadsheet[i][j];
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumSpreadsheet[r][c] += sumSpreadsheet[i][j];
			}
		}
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				if (j == c) {
					System.out.print(sumSpreadsheet[i][j]);
				} else {
					System.out.print(sumSpreadsheet[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
