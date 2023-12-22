
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[][] x = new int[N][N];
		int[][] y = new int[N][N];
		int[] A = new int[N];
		int flag = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {

			A[i] = scan.nextInt();

			for (int j = 0; j < A[i]; j++) {

				x[i][j] = scan.nextInt();
				y[i][j] = scan.nextInt();

			}

		}

		for (int i = (int) Math.pow(2, N) - 1; i >= 0; i--) {

			/*
			System.out.println("ループはじめ");
			System.out.println("for1");
			System.out.println(i);
			*/
			flag = 0;

			for (int j = 0; j < N; j++) {

				//System.out.println("for2");
				if (flag == 1) {
					break;
				}

				if ((1 & i >>> j) == 1) {//正直者であれば証言を精査する

					for (int k = 0; k < A[j]; k++) {

						/*
						System.out.println("for3");

						System.out.println("x["+ j + "][" + k + "]は" + x[j][k]);
						System.out.println("y["+ j + "][" + k + "]は" + y[j][k]);

						*/
						if ((y[j][k] & i >>> (x[j][k] - 1)) == 1
								|| (y[j][k] == 0 && ((1 & ~(i >>> (x[j][k] - 1))) == 1))) {

						} //else if ((y[j][k] & i >>> x[j][k]) == 1) {

						//}
						else {//正直者であるはずなのに証言が一致しない
							flag = 1;
							break;
						}

					}

				}
			}

			if (flag == 0) {
				if (ans < Integer.bitCount(i)) {
					ans = Integer.bitCount(i);
				}
			}

		}

		System.out.println(ans);
		scan.close();

	}
}
