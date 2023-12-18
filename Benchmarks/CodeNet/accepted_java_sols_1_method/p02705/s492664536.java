import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int R = sc.nextInt();
		
		// 結果の出力
		System.out.println(2 * Math.PI * R);

		sc.close();
	}
}
