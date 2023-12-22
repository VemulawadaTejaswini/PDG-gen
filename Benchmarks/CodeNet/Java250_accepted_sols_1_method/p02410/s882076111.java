import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n,m;

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();
		m = stdIn.nextInt();

		int[][] matrixA = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrixA[i][j] = stdIn.nextInt();
			}
		}

		int[] vectorB = new int[m];

		for(int i = 0; i < m; i++) {
			vectorB[i] = stdIn.nextInt();
		}

		int[] vectorC = new int[n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				vectorC[i] += (matrixA[i][j] * vectorB[j]);
			}
		}

		for(int i : vectorC) {
			System.out.println(i);
		}
	}

}