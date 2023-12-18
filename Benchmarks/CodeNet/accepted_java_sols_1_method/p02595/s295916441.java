import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		long D = scan.nextLong();

		long[] X = new long[N];
		long[] Y = new long[N];

		for (int i = 0; i < N; i++) {
			X[i] = scan.nextLong();
			Y[i] = scan.nextLong();
		}

		//演算
		int result = 0;

		for (int i = 0; i < N; i++) {
			if (D * D >= X[i] * X[i] + Y[i] * Y[i]) {
				result++;
			}

		}


		//結果出力
		System.out.println(result);
	}
}
