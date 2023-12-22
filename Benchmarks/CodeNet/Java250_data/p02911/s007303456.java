import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] ans = new int[n];

		for (int i = 0; i < n; i++) {
			ans[i] = k - q;
		}

		for (int i = 0; i < q; i++) {
			ans[sc.nextInt() - 1]++;
		}

		for (int i : ans) {
			System.out.println((i > 0) ? "Yes" : "No");
		}

	}
}