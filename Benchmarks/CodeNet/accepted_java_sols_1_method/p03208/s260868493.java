import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		Arrays.sort(h);

		for (int i = 0; i + K - 1 < N; i++) {
			if (h[i + K - 1] - h[i] < min) min = h[i + K - 1] - h[i];
		}


		System.out.println(min);

	}
}