
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextInt();

		long c = 0;
		for (long i = 0; i < a; i++) {
			long b = sc.nextLong();
			c *= b;
			if (i == 0) {
				c = b;
			}
		}
		if (c > 999999999999999999L) {
			c = -1;
		}

		// 出力
		System.out.println(c);
	}

}
