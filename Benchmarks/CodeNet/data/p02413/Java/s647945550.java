

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		int[][] A = new int[100][100];

		r = sc.nextInt();
		c = sc.nextInt();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++){
				A[i][c] += A[i][j];

			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++){
				A[r][j] += A[i][j];
			}

		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++){
				A[r][c] += A[i][j];
			}
		}

		for (int i = 0; i <= r; i++) {
			//
			for (int j = 0; j <= c; j++){
				if(j == c ){

					System.out.print(A[i][j]);
				}
				else{

					System.out.print(A[i][j]);
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}