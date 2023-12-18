import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		
		long i = Math.abs(X) / D;
		long r = Math.abs(X) % D;
		
		long result = 0;
		if (i >= K) {
			result = Math.abs(X) - (D * K);
		}
		else {
			if ((K - i) % 2 == 0) {
				result = r;
			}
			else {
				result = D - r;
			}
		}
		
		// 結果の出力
		System.out.println(result);
		
		sc.close();
	}
}
