import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String N = sc.next();
		
		char[] NcharArray = N.toCharArray();
		int sum = 0;
		for (int i = 0; i < NcharArray.length; i++) {
			sum +=Character.getNumericValue(NcharArray[i]);
		}
		
		// 結果の出力
		if (sum % 9 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}
}
