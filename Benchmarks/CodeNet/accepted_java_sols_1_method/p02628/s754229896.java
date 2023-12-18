import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 果物の数
		int n = sc.nextInt();
		// 購入する果物の数
		int k = sc.nextInt();

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		// sort
		Arrays.parallelSort(p);

		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans += p[i];
		}
		System.out.println(ans);
	}
}