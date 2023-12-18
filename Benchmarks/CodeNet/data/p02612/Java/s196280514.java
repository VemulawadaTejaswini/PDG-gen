import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		//WK変数

		//演算
		int result = (N + 999) / 1000 * 1000 - N;

		//結果出力
		System.out.println(result);
	}
}