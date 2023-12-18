import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		boolean answer = true;
		if (Y % 2 == 1) {
			answer = false;
		}
		else if (X * 4 < Y) {
			answer = false;
		}
		
		// 結果の出力
		System.out.println(answer? "Yes" : "No");

		sc.close();
	}
}
