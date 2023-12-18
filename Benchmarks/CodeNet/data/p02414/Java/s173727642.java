import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] AB = new long[n][l];
		
		// A,Bの成分を代入
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		
		// ABの成分の計算
		long sum_ij = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					sum_ij += A[i][k] * B[k][j];
				}
				AB[i][j] = sum_ij;
				sum_ij = 0;
			}
		}
		
		// 出力
		for (int i = 0; i < n; i++) {
			output.append(AB[i][0]);
			for (int j = 1; j < l; j++) {
				output.append(" ").append(AB[i][j]);
			}
			output.append('\n');
		}
		System.out.print(output);
		scan.close();
	}

}