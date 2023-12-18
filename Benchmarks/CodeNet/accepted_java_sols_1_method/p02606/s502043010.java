import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int L = scan.nextInt();
		int R = scan.nextInt();
		int d = scan.nextInt();

		//WK変数
		int result = R / d - (L - 1) / d;

		//演算



		//結果出力
		System.out.println(result);
	}
}