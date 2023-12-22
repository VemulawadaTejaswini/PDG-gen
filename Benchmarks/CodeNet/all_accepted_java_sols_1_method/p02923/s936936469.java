import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[] H = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();

		int max_cnt = 0;
		int[] memo = new int[H.length];
		Arrays.fill(memo, -1);
		for (int i = H.length - 2; i >= 0; i--) {
			int cnt = (H[i] >= H[i + 1] ? 1 : 0);
			if (cnt > 0 && memo[i + 1] >= 0) {
				memo[i] = memo[i + 1] + cnt;
			}
			else {
				memo[i] = cnt;
			}
			max_cnt = Math.max(max_cnt, memo[i]);
		}
		System.out.println(max_cnt);
	}
}