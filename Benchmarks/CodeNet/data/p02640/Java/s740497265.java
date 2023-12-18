import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		// 結果の出力
		if (Y % 2 == 1 || X * 4 < Y || X * 2 > Y) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

		sc.close();
	}
}
