import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.nextLine();

		if(S.substring(S.length() -1).equals("s")) {
			System.out.println(S + "es");
		} else {
			System.out.println(S + "s");
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
