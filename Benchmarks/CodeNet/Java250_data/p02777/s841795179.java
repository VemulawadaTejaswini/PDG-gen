import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 結果の出力
		System.out.println(sc.next().equals(S)? A-1 + " " + B : A + " " + (B-1));
		
		sc.close();
	}
}
