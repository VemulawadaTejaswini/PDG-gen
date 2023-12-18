import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), tmp = 0;
		long A[] = new long[N], ans = 0;
		for (int i = 0; i < N; ++i) A[i] = sc.nextLong();
		sc.close();
		Arrays.sort(A);
		for (int i = N - 1; i > 0 && tmp != 2; --i) {
			if (A[i - 1] == A[i]) {
				if (tmp == 0) {
					ans = A[i];
					tmp = 1;
				}
				else {
					ans *= A[i];
					tmp = 2;
				}
				--i;
			}
		}
		if (tmp == 2) System.out.print(ans);
		else System.out.print(0);
	}
}