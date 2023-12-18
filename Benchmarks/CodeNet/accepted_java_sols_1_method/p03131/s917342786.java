import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		if(A >= B || K <= A || B - A == 1) {
			System.out.println(K + 1);
			System.exit(0);
		}
		long t = K - (A - 1);
		long k = t / 2;
		long ans = k * B - (k - 1) * A + t % 2;
		System.out.println(ans);
	}
}