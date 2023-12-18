import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String alpha = sc.next();
		
		// 結果の出力
		System.out.println(Character.isUpperCase(alpha.charAt(0))? "A" : "a");
		
		sc.close();
	}
}
