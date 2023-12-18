import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		
		// 結果の出力
		if (K >= (A + B)) {
			System.out.println("0 0");
		}
		else if (K >= A) {
			System.out.println("0 " + (B - (K - A)));
		}
		else {
			System.out.println((A - K) + " " + B);
		}
		
		sc.close();
	}
}
