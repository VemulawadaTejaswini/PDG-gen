import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();

		long ans = 0;
		long total = A + B;

		if (A == 0) {
			System.out.println(0);
		} else {
			ans = ((N / total) * A) + Math.min(N % total, A);
			System.out.println(ans);
		}
	}

}
