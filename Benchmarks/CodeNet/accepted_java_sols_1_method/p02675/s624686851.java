import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String N = sc.next();

		// 結果の出力
		char lastChar = N.charAt(N.length() - 1);
		if (lastChar == '3') {
			System.out.println("bon");
		} else if (lastChar == '0' || lastChar == '1' || lastChar == '6' || lastChar == '8') {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}

		sc.close();
	}
}
