import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		long rem = N % K;
		
		// 結果の出力
		System.out.println(K - rem > rem? rem : K - rem);

		sc.close();
	}

}
