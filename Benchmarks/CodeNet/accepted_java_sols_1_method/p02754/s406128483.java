import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		if(A==0) {
			System.out.println(0);
			return;
		} else if(B==0) {
			System.out.println(N);
			return;
		}

		long J = N/(A+B);
		long K = N%(A+B) >= A ? A : N%(A+B);

		long result = (J*A) + K;
		System.out.println(result);
	}
}