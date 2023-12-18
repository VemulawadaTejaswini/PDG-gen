import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long[] t = new long[N];
		long max = 0, time = 0, ans = 0;

		for (int i = 0; i < N; i++) {
			t[i] = Long.valueOf(sc.next());
			if (max < t[i]) {
				max = t[i];
			}
		}

		for (int i = 0; i < N; i++) {
			time = max;
			while (time % t[i] != 0) {
				time += max;
			}
			if (ans < time) {
				ans = time;
				max = ans;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
