import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long X = sc.nextLong();

		// 結果の出力
		int count = 0;
		double deposit = 100;
		while (X > deposit) {
			count++;
			deposit = Math.floor(deposit * 1.01);
		}
		System.out.println(count);

		sc.close();
	}
}
