import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int L = sc.nextInt();
		
		// 結果の出力
		System.out.println(Math.pow(L, 3) / 27);

		sc.close();
	}
}
