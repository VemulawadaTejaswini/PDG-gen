import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int x = sc.nextInt();
		sc.close();
		
		// 結果の出力
		System.out.println(x == 0? 1 : 0);
	}
}
