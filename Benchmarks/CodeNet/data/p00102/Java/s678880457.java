import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] sheet;
		
		while (n != 0) {
			sheet = new int[n + 1][n + 1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					sheet[i][j] = scanner.nextInt();
				}
			}
			
			//sum
			for(int i = 0; i < n; i++) {
				sheet[i][n] = sum(i, n, sheet, true);
				sheet[n][i] = sum(i, n, sheet, false);
			}
			sheet[n][n] = sum(n, n, sheet, false);

			for(int i = 0; i <= n; i++) {
				for(int j = 0; j <= n; j++) {
					System.out.print(String.format("%1$5d", sheet[i][j]));
				}
				System.out.println();
			}

			n = scanner.nextInt();
		}
		scanner.close();
	}

	public static int sum(int num, int n, int[][] data, boolean isRow) {
		int ret = 0;
		if (isRow) {
			for(int i = 0; i < n; i++) {
				ret += data[num][i];
			}
		} else {
			for(int i = 0; i < n; i++) {
				ret += data[i][num];
			}
		}
		return ret;
	}
}