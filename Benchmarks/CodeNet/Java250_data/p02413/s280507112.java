import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int sumsum = 0;
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			sum = 0;
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j] + " ");
				sum += matrix[i][j];
				if (j == c - 1) {
					System.out.print(sum);
					sumsum += sum;
				}
			}
			System.out.println("");
		}
		for (int i = 0; i < c; i++) {
			sum = 0;
			for (int j = 0; j < r; j++) {
				sum += matrix[j][i];
			}
			System.out.print(sum + " ");
		}
		System.out.println(sumsum);
	}
}