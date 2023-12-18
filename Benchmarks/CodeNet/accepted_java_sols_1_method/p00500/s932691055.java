import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][] game = new int [n][3];
		int [][] result = new int [n][3];
		
		int i, j, k;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < 3; j++) {
				game[i][j] = sc.nextInt();
				result[i][j] = game[i][j];
			}
		}
		
		for (j = 0; j < 3; j++) {
			for (i = 0; i < n; i++) {
				for (k = 0; k < n; k++) {
					if (k != i) {
						if (game[i][j] == game[k][j]) {
							result[i][j] = 0;
						}
					}
				}
			}
		}
		
		for (i = 0; i < n; i++) {
			int sum = 0;
			for (j = 0; j < 3; j++) {
				sum += result[i][j];
			}
			System.out.println(sum);
		}
		
	}

}