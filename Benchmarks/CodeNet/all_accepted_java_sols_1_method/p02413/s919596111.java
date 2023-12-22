import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] table = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		int[] rowSum = new int[row];
		int[] colSum = new int[col];
		int sum = 0;
		Arrays.fill(rowSum, 0);
		Arrays.fill(colSum, 0);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sum += table[i][j];
				rowSum[i] += table[i][j];
				colSum[j] += table[i][j];
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("" + table[i][j] + " ");
			}
			System.out.println("" + rowSum[i]);
		}
		for(int j = 0; j < col; j++) {
			System.out.print("" + colSum[j] + " ");
		}
		System.out.println(sum);
	}
}