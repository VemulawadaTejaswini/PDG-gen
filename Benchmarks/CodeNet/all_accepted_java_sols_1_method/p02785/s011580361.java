import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long HP[] = new long[N];
		for (int i = 0; i < N; i++) {
			HP[i] = sc.nextInt();
		}
		if (N <= K) {
			System.out.println(0);
		} else {
			long ksum = 0;
			Arrays.sort(HP);
			for (int i = N - K - 1; i >= 0; i--) {
				ksum += HP[i];
			}
			System.out.println(ksum);
		}

	}

}
