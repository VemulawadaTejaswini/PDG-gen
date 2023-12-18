
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();

		long ans = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j * i <= n; j++) {
				ans = ans + (j * i);
			}
		}
		System.out.println(ans);
	}

}