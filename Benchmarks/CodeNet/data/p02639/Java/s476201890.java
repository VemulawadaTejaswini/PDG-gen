import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int[] x = new int[5];

		for (int i = 0; i < 5; i++) {
			x[i] = scan.nextInt();
		}

		//WK変数

		//演算
		int result = 1;

		for (int num : x) {

			if (num == 0) {
				break;
			}
			result++;
		}
		;

		//結果出力
		System.out.println(result);
	}
}