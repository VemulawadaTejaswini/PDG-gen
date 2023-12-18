import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		String T = sc.next();
		
		// 結果の出力
		System.out.println(T + S);
		
		sc.close();
	}
}
