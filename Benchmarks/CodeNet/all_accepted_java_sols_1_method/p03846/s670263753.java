import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
		}
		Arrays.sort(A);
		long ans = 1;
		int mod = 1000_000_007;
		for (int i = N-1; i > 0; i-=2) {
			if (A[i] != i || A[i-1] != i) {
				ans *= 0;
			} else {
				ans *= 2;
				ans %= mod;
			}
		}
		if (N % 2 == 1 && A[0] != 0) {
			ans *= 0;
		}
		System.out.print(ans);
		reader.close();
	}
}



