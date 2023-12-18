import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		long[] A = new long[N];

		long sum = 0L;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
			sum += A[i];
		}

		//演算
		long result = 0L;
		long con = 1000000007L;

		for (int i = 0; i < N; i++) {
			sum -= A[i];
			result += ((sum % con) * A[i]) % con;
			result %= con;
		}

		//結果出力
		System.out.println(result);
	}
}
