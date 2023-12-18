import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		//WK変数
		int result =0;

		//演算
		for (int i = 0; i < N; i += 2) {
			result += a[i] % 2;
		}

		//結果出力
		System.out.println(result);
	}
}