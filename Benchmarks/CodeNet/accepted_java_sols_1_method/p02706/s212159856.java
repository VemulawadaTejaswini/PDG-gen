import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long sum = 0;
		for(long i = 0; i < M; i++) {
			long a = sc.nextLong();
			sum += a;
		}
		sc.close();
		System.out.println(N < sum ? -1 : N - sum);
	}
}