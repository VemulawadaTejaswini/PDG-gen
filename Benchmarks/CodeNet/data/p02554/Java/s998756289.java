import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		long N = scan.nextLong();

		long con = 1000000007L;

		long res8 = 1L;
		long res9 = 1L;
		long res10 = 1L;

		for (int i = 0; i < N; i++) {
			res8 *= 8L;
			res9 *= 9L;
			res10 *= 10L;
			res8 = rest(res8);
			res9 = rest(res9);
			res10 = rest(res10);
		}

		long result = res10 - 2 * res9 + res8;

		while (result < 0L || result >= con) {
			if (result < 0L) {
				result += con;
			} else {
				result -= con;
			}
		}
		//結果出力
		System.out.println(result);
	}

	public static long rest(long res) {

		long con = 1000000007L;

		return res % con;
	}
}