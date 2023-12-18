import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int X = scan.nextInt();
		int Y = scan.nextInt();

		//WK変数

		//演算
		String result = "No";

		if (Y % 2 == 0 && 2 * X <= Y && Y <= 4 * X) {
			result = "Yes";
		}

		//結果出力
		System.out.println(result);
	}
}