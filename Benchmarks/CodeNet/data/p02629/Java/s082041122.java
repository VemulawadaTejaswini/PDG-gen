import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		
		long x = N;
		StringBuilder sb = new StringBuilder();
		while (x > 0) {
			long r = x % 26 - 1;
			sb.append((char)('a' + r));
			x = x / 26;
		}
		// 結果の出力
		System.out.println(sb.reverse().toString());
		
		sc.close();
	}
}
