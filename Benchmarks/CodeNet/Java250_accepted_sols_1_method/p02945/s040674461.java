import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int wk = Math.max(a+b, a-b);

		// 出力
		System.out.println(Math.max(wk, a*b));
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
