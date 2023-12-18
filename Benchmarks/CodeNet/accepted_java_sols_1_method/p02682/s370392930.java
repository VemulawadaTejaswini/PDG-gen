import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long K = scan.nextLong();

		//WK変数
		long result = 0L;

		if (A >= K) {
			result = K;
		} else if (A + B >= K) {
			result = A;
		} else {
			result = A - (K - A - B);
		}

		//演算

		//結果出力
		System.out.println(result);
	}
}