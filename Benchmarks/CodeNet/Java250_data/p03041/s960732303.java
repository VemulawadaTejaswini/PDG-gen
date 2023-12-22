import java.util.Scanner;

public class Main {

	// A, B, C からなる長さ N の文字列 S と、1 以上 N 以下の整数 K が与えられます。
	// 文字列 S の K 文字目を小文字に書き換え、新しくできた S を出力してください。

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int K = in.nextInt();
		String S = in.next();

		if ( K == 1 ) {
			String target = S.substring(0, 1);
			String back = S.substring(K);

			String result = target.toLowerCase() + back;
			System.out.println(result);
			return;
		}

		String front = S.substring(0, K - 1);
		String target = S.substring(K - 1, K);
		String back = S.substring(K);

		String result = front + target.toLowerCase() + back;

		System.out.println(result);
	}
}
