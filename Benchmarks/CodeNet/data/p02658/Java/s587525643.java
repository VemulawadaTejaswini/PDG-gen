import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long sum = 1;
		long a = (long) Math.pow(10, 18);
		long A;

		for (int i = 0; i < N; i++) {
			A = sc.nextLong();
			sum = sum * A;
		}
		sc.close();

		if (sum > a) {
			System.out.println(-1);
			return;
		}

		System.out.println(sum);

	}

}
