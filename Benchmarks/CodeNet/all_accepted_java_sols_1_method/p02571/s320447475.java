import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		String T = sc.next();
		char[] ScharArray = S.toCharArray();
		char[] TcharArray = T.toCharArray();
		
		// 結果の出力
		int count = T.length();
		for (int i = 0; i <= (S.length() - T.length()); i++) {
			int diff = 0;
			for (int j = 0; j < T.length(); j++) {
				if (TcharArray[j] != ScharArray[i + j]) {
					diff++;
				}
			}
			count = Math.min(count, diff);
		}
		System.out.println(count);
		
		sc.close();
	}
}
