import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		
		int count = 0;
		
		// 結果の出力
		for (int i = 0; i < S.length; i++) {
			if (S[i] != T[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}
