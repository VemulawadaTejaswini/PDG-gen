import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		long dif[] = new long[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			dif[i] = a[i] - i - 1;
		}
		Arrays.sort(dif);
		long median = 0;

		if (N == 1) {
			System.out.println(0);
			return;
		}

		if (N%2 != 0) {
			median = dif[(N-1)/2];
		} else {
			median = (dif[N/2 - 1] + dif[N/2])/2;
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(dif[i] - median);
		}
		System.out.println(ans);
	}
}
