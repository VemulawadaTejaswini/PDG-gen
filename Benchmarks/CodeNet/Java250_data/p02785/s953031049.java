import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		Long[] H = new Long[N];

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}

		if (K >= N) {
			System.out.println(0); // 全て必殺技
		} else {
			Arrays.sort(H, Collections.reverseOrder());

			Long[] M = Arrays.copyOfRange(H, K, H.length);
			long sum = 0;

			for (int i = 0; i < M.length; i++) {
				sum += M[i];
			}

			System.out.println(sum);
		}

		sc.close();
	}

}
