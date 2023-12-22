import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long A = sc.nextLong();
		double B = sc.nextDouble();
		
		if (B == 0) {
			System.out.println(0);
			sc.close();
			return;
		}
		
		long C = Math.round(B * 100);
		long D = A * C;

		// 結果の出力
		System.out.println(Math.floorDiv(D, 100));

		sc.close();
	}
}
