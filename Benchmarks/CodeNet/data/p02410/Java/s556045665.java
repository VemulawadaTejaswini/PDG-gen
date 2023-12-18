import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		int n,m;

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String[] inputline = stdIn.readLine().split(" ");


		n = Integer.parseInt(inputline[0]);
		m = Integer.parseInt(inputline[1]);

		int[][] matrixA = new int[n][m];

		for(int i = 0; i < n; i++) {
			inputline = stdIn.readLine().split(" ");
			for(int j = 0; j < m; j++) {
				matrixA[i][j] = Integer.parseInt(inputline[j]);
			}
		}

		int[] vectorB = new int[m];

		for(int i = 0; i < m; i++) {
			inputline = stdIn.readLine().split(" ");
			vectorB[i] = Integer.parseInt(inputline[0]);
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