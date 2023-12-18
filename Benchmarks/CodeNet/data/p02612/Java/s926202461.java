import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		
		// 結果の出力
		System.out.println(N % 1000 == 0? 0 : 1000 - N % 1000);
		
		sc.close();
	}
}
