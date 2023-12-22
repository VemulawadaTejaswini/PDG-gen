import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextLong();
		int sqrtn = (int) Math.sqrt(N);
		long a = 0;

		for (long i = 1; i <= sqrtn;) {
			if (N % i == 0) {
				a = N / i;
			}
			i++;
		}

		long b = N / a;
		long ans = Math.max(a, b);
		int len = String.valueOf(ans).length();

		// 出力
		System.out.println(len);
	}
}
