import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int K = scan.nextInt();
		String S = scan.next();

		//WK変数
		String result = S;

		//演算
		if (S.length() > K) {
			result = S.substring(0, K) + "...";
		}

		//結果出力
		System.out.println(result);
	}
}