import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		if(A == 0) {
			System.out.println(0);
			return;
		}
		long p = N / (A + B);
		long d = N % (A + B);
		if(A < d) d = A;
		System.out.println((p * A) + d);
	}
}
