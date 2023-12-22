import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		long ans = 0;

		for (int i = 1; i <= N; i++) {

			//3の倍数でもあり5の倍数でもある場合
			if (i % 3 == 0 && i % 5 == 0) {
			
			}

			//3の倍数の場合
			else if (i % 3 == 0) {
				
			}
			//5の倍数の場合
			else if (i % 5 == 0) {
				
			//3と5の倍数以外の場合
			} else {
				
				ans += i;

			}

		}
		System.out.println(ans);

		scanner.close();
	}
}
