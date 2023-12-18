

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numM = sc.nextInt();
        int numL = sc.nextInt();
		// insert size;
		int arrA[][] = new int[numN][numM]; // [3][2]
		int arrB[][] = new int[numM][numL]; // [2][3]
		int arrTot[][] = new int[numN][numL];
		//elements of A,B,C is aij, bij, cij;

		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numM; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < numM; i++) {
			for (int j = 0; j < numL; j++) {
				arrB[i][j] = sc.nextInt(); // clear
			}
		}

		// Constrainsts
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numL; j++) {
				for (int k = 0; k < numM; k++) {
					arrTot[i][j] += arrA[i][k] * arrB[k][j];
				}
			}
		}
		for (int i = 0; i < numN; i++) {
			System.out.print(arrTot[i][0]);
			for (int j = 1; j < numL; j++) {
				System.out.print(" " + arrTot[i][j]);
			}
			System.out.println();
		}
	}
}