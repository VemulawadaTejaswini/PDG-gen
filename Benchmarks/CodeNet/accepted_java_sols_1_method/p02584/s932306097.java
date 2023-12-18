import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		if(X < 0) {
			X = -X;
		}

		long min_plus_n = X / D;
		long min_plus = X % D;
		long min_minus_n = min_plus_n + 1;
		long min_minus = Math.abs(min_plus-D);

		if(K <=min_minus_n) {
			System.out.println(Math.abs(X-D*K));
			return;
		}

		if(K % 2 == min_plus_n % 2) {
			System.out.println(min_plus);
		}else {
			System.out.println(min_minus);
		}

	}


}
