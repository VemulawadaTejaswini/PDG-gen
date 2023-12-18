import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int[][] I = new int[c+1][r+1];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				I[i][j] = sc.nextInt();
				I[i][r] += I[i][j];
			}
		}
		for(int j = 0; j < r+1; j++) {
			for(int i = 0; i < c; i++) {
				I[c][j] += I[i][j];
			}
		}
		for(int i = 0; i <= c; i++) {
			for(int j = 0; j <= r; j++) {
				System.out.printf("%d ", I[i][j]);
			}
			System.out.println();
		}
	}
}

