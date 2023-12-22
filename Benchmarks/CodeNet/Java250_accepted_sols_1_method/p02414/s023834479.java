import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input_nml = "";
		String[] nml_data = new String[3];
		int n = 0;
		int m = 0;
		int l = 0;
		boolean judge = true;

		input_nml = sc.nextLine();
		nml_data = input_nml.split(" ");
		n = Integer.parseInt(nml_data[0]);
		m = Integer.parseInt(nml_data[1]);
		l = Integer.parseInt(nml_data[2]);

		if ((1 > n || n > 100) || (1 > m || m > 100) || (1 > l || l > 100)) {
			judge = false;
		}

		if (judge == true) {
			String input_AB = "";
			String[] A_in = new String[m];
			int[][] A_out = new int[n][m];
			String[] B_in = new String[l];
			int[][] B_out = new int[m][l];
			long[][] C_out = new long[n][l];
			String[] output_result = new String[n];

			// Aの入力とその値のチェック
			out: for (int i = 0; i < n; i++) {
				input_AB = sc.nextLine();
				A_in = input_AB.split(" ");

				for (int j = 0; j < m; j++) {
					A_out[i][j] = Integer.parseInt(A_in[j]);

					if (A_out[i][j] < 0 || A_out[i][j] > 10000) {
						judge = false;
						break out;
					}

				}

			}// Aの入力ここまで

			if (judge == true) {

				// Bの入力とその値のチェック
				out: for (int k = 0; k < m; k++) {
					input_AB = sc.nextLine();
					B_in = input_AB.split(" ");

					for (int p = 0; p < l; p++) {
						B_out[k][p] = Integer.parseInt(B_in[p]);

						if (B_out[k][p] < 0 || B_out[k][p] > 10000) {
							judge = false;
							break out;
						}

					}

				}

			}// Bの入力ここまで

			if (judge == true) {

				for (int i = 0; i < n; i++) {
					output_result[i] = "";
					for (int j = 0; j < l; j++) {

						for (int k = 0; k < m; k++) {
							C_out[i][j] += A_out[i][k] * B_out[k][j];

						}
						if (j == 0) {
							output_result[i] += "" + C_out[i][j];
						} else {
							output_result[i] += " " + C_out[i][j];
						}
						// System.out.print(C_out[i][j]);

					}

					System.out.println(output_result[i]);
					// System.out.println();
				}

			}

		}

	}
}

