import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		
		StringBuilder sb = new StringBuilder();
		while (N > 0) {
			N = N - 1;
			long r = N % 26;
			sb.append((char)('a' + r));
			N = N / 26;
		}
		// 結果の出力
		System.out.println(sb.reverse().toString());
		
		sc.close();
	}
}
