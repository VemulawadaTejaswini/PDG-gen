import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		
		// 結果の出力
		if (S.equals("AAA") || S.equals("BBB")) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

		sc.close();
	}
}
