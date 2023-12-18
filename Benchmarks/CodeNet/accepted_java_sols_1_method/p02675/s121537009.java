import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		//WK変数
		String result = "hon";
		int last = N % 10;

		//演算
		if (last == 3) {
			result = "bon";
		} else if (last == 0 || last == 1 || last == 6 || last == 8) {
			result = "pon";
		}

		//結果出力
		System.out.println(result);
	}
}