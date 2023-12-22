import java.util.Scanner;

public class Main {

	public static long CONST = (long) Math.pow(10,9) + 7L;

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long N = scan.nextLong();
		long K = scan.nextLong();

		//WK変数
		long count = 0L;

		//演算
		for (long i = K; i < N + 2L; i++) {
			count += (N * i - i * (i - 1L) + 1L) % CONST;
			count %= CONST;
		}

		//結果出力
		System.out.println(count);
	}
}