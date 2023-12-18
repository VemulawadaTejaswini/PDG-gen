import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//倍数
		int K = sc.nextInt();
		//以上
		int A = sc.nextInt();
		//以下
		int B = sc.nextInt();

		sc.close();

		//A以上Bまでの範囲
		for (int i = A; i <= B; i++) {
			if (i % K == 0) {
				System.out.println("OK");
				return;

			}

		}
		System.out.println("NG");

	}

}
