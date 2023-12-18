
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i + 1; j < N; j++) {
				long let = (A[i] * A[j]) % 1000000007;
				ans = (ans + let) % 1000000007;
			}
		}

		System.out.println(ans);
	}

}