

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	/*
	 * n*m A // A[n][m]
	 *
	 * m*1 b // b[m*1]
	 *
	 * A+=b = sysout
	 *
	 * A[ni][mj]
	 *
	 * b[mi]
	 */

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ???????????????
		String[] line  = br.readLine().split(" ");
		int n=0,m=0;
		n = Integer.parseInt(line[0]); // 3
		m = Integer.parseInt(line[1]); // 4

		int[][] vector_A = new int[n][m]; // [3][4]

		int[] vector_B = new int[m]; // [4*1]


		// ?????±?????\??????


		for (int i = 0; i < n; i++) {

			// * 1 2 0 1 0 3 0 1 4 1 1 0

			String [] data = br.readLine().split(" ");// ??????????????????????????¶
			for	(int j= 0; j < m; j++){
				vector_A[i][j] = Integer.parseInt(data[j]);
			}
		}

		for (int i = 0; i < m; i++) {// 1230
			String data2 = br.readLine();
			vector_B[i] = Integer.parseInt(data2);
		}

		/*
		 * 1201 0301 4110
		 *
		 * 1230
		 *
		 * 1*1=1, 2*2=4, 0*3=0, 1*0=0 tot=5 ...
		 *
		 *
		 */

		for (int i = 0; i < n; i++) {
			int tot = 0;
			for (int j = 0; j < m; j++) {
				tot += vector_A[i][j] * vector_B[j];

			}
			System.out.println(tot);
		}

		// sc.close();

	}

}