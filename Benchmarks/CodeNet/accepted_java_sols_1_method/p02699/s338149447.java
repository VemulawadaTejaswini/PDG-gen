import java.util.Scanner;

public class Main {

	public static long CONST = (long) Math.pow(10, 9) + 7L;

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int S = scan.nextInt();
		int W = scan.nextInt();

		//WK変数

		//演算

		//結果出力
		System.out.println(S > W ? "safe" : "unsafe");
	}
}