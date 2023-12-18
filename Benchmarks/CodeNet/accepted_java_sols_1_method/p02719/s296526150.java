import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long K = sc.nextLong();

		long result = N;

		//あまり求める
		if(result > K) {
			result = result % K;
		}

		//差分求める
		long tmp = result;
		if(tmp < K) {
			tmp = K - tmp;
		} else {
			tmp = tmp - K;
		}

		if(result > tmp) {
			result = tmp;
		}

		if(result > N) {
			result = N;
		}

		System.out.println(Math.abs(result));

	}
}