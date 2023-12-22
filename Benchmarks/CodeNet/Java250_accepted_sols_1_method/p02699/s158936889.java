import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int S = sc.nextInt();
		int W = sc.nextInt();
		
		// 結果の出力
		System.out.println(S <= W? "unsafe" : "safe");

		sc.close();
	}
}
