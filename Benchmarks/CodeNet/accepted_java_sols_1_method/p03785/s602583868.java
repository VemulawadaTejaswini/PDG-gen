import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N,C,K;
			N = scanner.nextInt();
			C = scanner.nextInt();
			K = scanner.nextInt();

			int[] T = new int[N];
			for (int i = 0; i < N; i++) {
				T[i] = scanner.nextInt();
			}


			Arrays.sort(T);

			int cnt = 1;
			int bus = 1;
			int busTime = T[0];

			for (int i = 1; i < N; i++) {
				if (cnt == C || T[i] > busTime + K) {
					cnt = 0;
					busTime = T[i];
					bus++;
				}
				cnt++;
			}

			System.out.println(bus);
		}
	}
}