import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int a = sc.nextInt();
		
		// 結果の出力
		System.out.println(a + a*a + a*a*a);
		
		sc.close();
	}
}
