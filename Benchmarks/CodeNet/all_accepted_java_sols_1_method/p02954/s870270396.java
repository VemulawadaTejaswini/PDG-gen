import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");
		int[] ans = new int[S.length];

		int cnt = 0;
		for (int i = 0; i < S.length; i++) {
			if ("R".equals(S[i])) {
				cnt++;
			} else {
				ans[i] += cnt / 2;
				ans[i - 1] += (cnt + 1) / 2;
				cnt = 0;
			}
		}
		for (int i = S.length - 1; i >= 0; i--) {
			if ("L".equals(S[i])) {
				cnt++;
			} else {
				ans[i] += cnt / 2;
				ans[i + 1] += (cnt + 1) / 2;
				cnt = 0;
			}
		}

		Arrays.stream(ans).forEach(s -> System.out.print(s + " "));
	}
}