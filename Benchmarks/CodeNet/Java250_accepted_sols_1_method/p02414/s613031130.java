public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		sc.nextLine(); // nextInt()??????????????£?????????"\n"????¶????????????????

		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];

		for (int i=0; i < n; i++) {

			String[] data = sc.nextLine().split(" ");

			for (int j=0; j < m; j++) {
				A[i][j] = Integer.parseInt(data[j]);
			}

		}

		for (int j=0; j < m; j++) {

			String[] data = sc.nextLine().split(" ");

			for (int k=0; k < l; k++) {
				B[j][k] = Integer.parseInt(data[k]);
			}

		}

		// C[i][k] = sigma(j : 0 -> m) A[i][j] * B[j][k]

		for (int i=0; i < n; i++) {

			for (int k=0; k < l; k++) {

				for (int j=0; j < m; j++) {
					C[i][k] += A[i][j] * B[j][k];
				}

			}

		}

		for (int i=0; i < n; i++) {
			for (int k=0; k < l-1; k++) {
				System.out.print(C[i][k] + " ");
			}
			System.out.println(C[i][l-1]);
		}

	}

}