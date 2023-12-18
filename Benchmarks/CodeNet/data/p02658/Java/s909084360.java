
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		ints a = sc.nextInt();

		long c = 0;
		for (int i = 0; i < a; i++) {
			long b = sc.nextLong();
			c *= b;
			if (i == 0) {
				c = b;
			}
		}
		if (c > 1000000000000000000L) {
			c = -1;
		}

		// 出力
		System.out.println(c);
	}

}
