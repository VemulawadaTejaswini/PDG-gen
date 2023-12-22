import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int[][] list = new int [101][101];
		int r = sc.nextInt();
		int c = sc.nextInt();

		for (int i =0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				list[i][j] = sc.nextInt();
				sum += list[i][j];
			}
			list[i][c] = sum;
 		}

		for (int i = 0; i <= c; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += list[j][i];
			}
			list[r][i] = sum;
		}

		String space = " ";
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j < c) {
					System.out.print(list[i][j] + space);
				} else {
					System.out.print(list[i][j]);
				}
			}
			System.out.println("");
		}
	}
}