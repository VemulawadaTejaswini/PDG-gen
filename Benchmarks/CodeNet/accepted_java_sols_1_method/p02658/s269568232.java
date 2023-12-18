import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 1;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			if (a == 0) {
				System.out.println(0);
				return;
			}
			A[i] = a;
		}
		for (int i = 0; i < N; i++) {
			if (1000000000000000000L / ans < A[i]) {
				System.out.println("-1");
				return;
			}
			ans *= A[i];
		}
		System.out.println(ans);
	}

}
