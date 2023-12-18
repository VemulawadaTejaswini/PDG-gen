import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		Long[] HP = new Long[N];

		for (int i = 0; i < N; i++) {
			HP[i] = sc.nextLong();
		}

		Arrays.sort(HP);

		long cnt = 0;
		if (N > K) {
			for (int i = 0; i < (N - K); i++) {
				cnt += HP[i];
			}
		}

		System.out.print(cnt);

		sc.close();

	}

}