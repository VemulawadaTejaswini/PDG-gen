import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		int[] a = new int[N];

		int all = 0;

		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			all ^= a[i];
		}

		//演算


		//結果出力
		for (int i = 0; i < N; i++) {
			System.out.print(all ^ a[i]);

			if (i != N - 1) {
				System.out.print(" ");
			}
		}
	}
}
