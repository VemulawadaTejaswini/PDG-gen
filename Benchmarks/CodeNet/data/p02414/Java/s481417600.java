

import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int numN = sc.nextInt();
		int numM = sc.nextInt();
		int numL = sc.nextInt();
		int arrA[][] = new int[numN][numM];
		int arrB[][] = new int[numM][numL];
		int arrTot[][] = new int[numN][numL];

		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numM; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < numM; i++) {
			for (int j = 0; j < numL; j++) {
				arrB[i][j] = sc.nextInt();
			}
		}
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