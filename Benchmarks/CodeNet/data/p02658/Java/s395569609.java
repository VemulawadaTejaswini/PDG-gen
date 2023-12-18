import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}

		//WK変数
		long result = 1L;

		//演算

		for (int i = 0; i < N; i++) {

			if (A[i] == 0L) {
			result = 0L;
			break;
			}
		}

		for (int i = 0; i < N; i++) {
			result *= A[i];

			if (result > 1000000000000000000L) {
			result = -1L;
			break;
			}
		}

		//結果出力
			System.out.println(result);
	}
}