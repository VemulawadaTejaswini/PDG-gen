import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		
		long tmp = Math.abs(X);
		for (long i = 1; i <= K; i++) {
			if (tmp >= D) {
				tmp -= D;
			}
			else {
				if ((K - i) % 2 == 0) {
					tmp -= D;
				}
				break;
			}
		}
		
		// 結果の出力
		System.out.println(Math.abs(tmp));
		
		sc.close();
	}
}
