import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		if (N < K) {
			System.out.println(Math.min(N, Math.abs(N - K)));
		} else {
			System.out.println(Math.min(N % K, Math.abs((N % K) - K)));
		}
	}

}