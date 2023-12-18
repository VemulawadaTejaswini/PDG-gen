import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	public void copy (int i, int j, int game[][], int result[][]) {
		result[i][j] = game[i][j];
	}
	
	public void decisionmain (int n, int game[][], int result[][]) {
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < n; k++) {
					decisionsub(i, j, k, game, result);
				}
			}
		}	
	}
	
	public void decisionsub (int i, int j, int k, int game[][], int result[][]) {
		if (k != i) {
			if (game[i][j] == game[k][j]) {
				result[i][j] = 0;
			}
		}
	}
	
	public void scoresum (int n, int result[][]) {
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += result[i][j];
			}
			System.out.println(sum);
		}
	}
	
	void doIt () {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();

		int [][] game = new int [n][3];
		int [][] result = new int [n][3];

		int i, j;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < 3; j++) {
				game[i][j] = sc.nextInt();
				copy(i, j, game, result);
			}
		}
		
		decisionmain(n, game, result);
		scoresum(n, result);
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		new Main(). doIt();
		
	}

}