

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] nico = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(nico[j]);
			}
		}

		int[][] tmpj = new int[n][n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < tmpj[0].length; j++) {
				tmpj[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < tmpj[0].length; j++) {
				if (j > 0) tmpj[i][j] = tmpj[i][j - 1] + matrix[i][j - 1];
				else tmpj[i][j] = matrix[i][j];
			}
		}		//ここただの累積和

		/*String unko="";

		for(int i=0; i<n; i++) {
			unko="";
			for(int j=0; j<=n; j++) {
				unko=unko+tmpj[i][j]+" ";
			}
			System.out.println(unko);
		}*/

		int max = Integer.MIN_VALUE;
		for (int si = 0; si < n; si++) {
			for (int ei = (si + 1); ei <= n; ei++) {

				for (int sj = 0; sj < n; sj++) {
					for (int ej = (sj + 1); ej <= n; ej++) {

						int sum = 0;
						for (int i = si; i < ei; i++) {
							sum = sum + tmpj[i][ej] - tmpj[i][sj];
						}
						if (max < sum) max = sum;		//ここただ純粋に総当たりすれば良いのか…困惑  O(N^3)だから100で通るのか
					}
				}
			}
		}

		System.out.println(max);
	}
}
