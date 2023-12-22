import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		
		// 結果の出力
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(S[i]);
			sb.append(T[i]);
		}
		System.out.println(sb.toString());
		
		sc.close();
	}
}
