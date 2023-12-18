import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		long A = scan.nextLong();
		int B = (int) (scan.nextDouble() * 100);

		//WK変数
		long result = A * B / 100;

		//演算


		//結果出力
			System.out.println(result);
	}
}