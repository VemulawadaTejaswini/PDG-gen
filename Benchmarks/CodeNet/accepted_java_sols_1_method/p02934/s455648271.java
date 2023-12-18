import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		double ans = 0;

		for (int i = 0; i < N; i++) {
			ans += 1 / sc.nextDouble();

		}
		System.out.println(1/ans);
	}
}