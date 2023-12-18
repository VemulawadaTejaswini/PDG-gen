import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			int[] W = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();

			int min = Integer.MAX_VALUE / 2;
			int pre_sum = W[0];
			int post_sum = Arrays.stream(W).sum() - W[0];
			for (int i = 1; i < N; i++) {
				pre_sum += W[i];
				post_sum -= W[i];
				min = Math.min(min, Math.abs(pre_sum - post_sum));
			}
			System.out.println(min);
		}
	}
}