import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		sc.close();
		
		// 結果の出力
		long ac = a * c;
		long ad = a * d;
		long bc = b * c;
		long bd = b * d;
		System.out.println(Math.max(ac, Math.max(ad, Math.max(bc, bd))));
	}
}
