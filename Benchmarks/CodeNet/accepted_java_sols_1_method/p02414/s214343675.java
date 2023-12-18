import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String[] line1b = line1.split(" ");
		int n = Integer.parseInt(line1b[0]);
		int m = Integer.parseInt(line1b[1]);
		int l = Integer.parseInt(line1b[2]);

		int[][] matA = new int[n][m];
		int[][] matB = new int[m][l];
		
		long[][] matC = new long[n][l];

		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();
			String[] strA = kari.split(" ");
			for (int j = 0; j < m; j++) {
				matA[i][j] = Integer.parseInt(strA[j]);
			}
		}

		for (int i = 0; i < m; i++) {
			String kari = sc.nextLine();
			String[] strB = kari.split(" ");
			for (int j = 0; j < l; j++) {
				matB[i][j] = Integer.parseInt(strB[j]);
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < l; k++) {
					matC[i][k] += matA[i][j]*matB[j][k];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(matC[i][j]);
				if (j != l-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}