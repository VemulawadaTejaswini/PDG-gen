import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		long X = scan.nextLong();
		long K = scan.nextLong();
		long D = scan.nextLong();

		//演算
		long result = 0L;

		if (Math.abs(X) / D >= K) {
			result = Math.min(Math.abs(X - K * D), Math.abs(X + K * D));
		} else if ((K - Math.abs(X) / D) % 2 == 0){
			result = Math.abs(X) % D;
		} else {
			result = D - Math.abs(X) % D;
		}

		//結果出力
			System.out.println(result);
	}
}
