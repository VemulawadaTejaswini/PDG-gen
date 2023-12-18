
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] balls = new int[N + 1];

		HashSet<Integer> disballs = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			disballs.add(b);
			balls[b]++;
		}

		int sabun = disballs.size() - K;
		if (sabun <= 0) {
			System.out.println(0);
			return;
		}

		Arrays.parallelSort(balls);
		int sum = 0;
		int c = 0;
		for (int i = 0; i < balls.length; i++) {
			if (balls[i] > 0) {
				sum += balls[i];
				c++;
			}
			if (c >= sabun)
				break;
		}
		System.out.println(sum);

	}
}

