

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int line = in.nextInt();
		int line_column = in.nextInt();
		int column = in.nextInt();

		int[][] matrixA = new int[line][line_column];
		int[][] matrixB = new int[line_column][column];

		for(int l = 0; l < line; l++){

			for(int l_c = 0; l_c < line_column; l_c++){

				matrixA[l][l_c] = in.nextInt();

			}
		}

		for(int l_c = 0; l_c < line_column; l_c++){

			for(int c = 0; c < column; c++){

				matrixB[l_c][c] = in.nextInt();

			}
		}

		long[][] ans = new long[line][column];

		for(int l = 0; l < line; l++){

			for(int l_c = 0; l_c < line_column; l_c++){

				for(int c = 0; c < column; c++){

					ans[l][c] += matrixA[l][l_c] * matrixB[l_c][c];

				}
			}
		}

		for(int l = 0; l < line; l++){

			for(int c = 0; c < column - 1; c++){

				System.out.print(ans[l][c] + " ");

			}

			System.out.println(ans[l][column - 1]);

		}
	}
}