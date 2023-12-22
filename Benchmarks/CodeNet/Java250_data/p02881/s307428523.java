import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num = 0;			// 与えられた数
		long answer = 0;		// 正解
		double limit = 0.0;		// 探索の上限

		// 数字の入力
		num = scan.nextLong();
		answer = num;
		limit = Math.sqrt(num);

		// 該当マスの調査
		for(int i = 1; i <= limit; i++) {
			if(num % i == 0 && (num / i) + i - 2 < answer) {
				answer = (num / i) + i - 2;
			}
		}

		// 結果の出力
		System.out.println(answer);

	}
}
