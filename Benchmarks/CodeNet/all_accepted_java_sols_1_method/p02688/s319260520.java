import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] ans = new int[N];
		int ans2 = 0;

		for (int i = 0; i < K; i++) {
			int dk = sc.nextInt();
			int list[] = new int[dk];
			for (int c = 0; c < dk; c++) {
				list[c] = sc.nextInt();
			}
			for (int num : list) {
				ans[num - 1] = 9;
			}
		}

		for (int num : ans) {
			if (num == 9) {
				ans2++;
			}
		}

		System.out.println(N - ans2);
	}
}
