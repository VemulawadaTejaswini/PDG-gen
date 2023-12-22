import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ans = new int[1001];
		for (int i = 1; i < 1000; ++i) {
			int sum = i;
			for (int j = i + 1;; ++j) {
				sum += j;
				if (sum > 1000) break;
				ans[sum]++;
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			System.out.println(ans[N]);
		}
	}
}