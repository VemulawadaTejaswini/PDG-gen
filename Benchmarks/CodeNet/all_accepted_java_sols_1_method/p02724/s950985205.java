import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		long X = scanner.nextLong();

		long c500 = X / 500;
		// 500 円硬貨の数 6 
		long r500 = X % 500; // 端数
		long c5 = r500 / 5;
		// 5 円硬貨の数 8
		System.out.println(c500 * 1000 + c5 * 5);

		scanner.close();
	}
}
