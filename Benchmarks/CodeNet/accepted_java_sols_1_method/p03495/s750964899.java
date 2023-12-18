import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] cnt = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			cnt[a]++;
		}
		sc.close();

		Arrays.parallelSort(cnt);
		int ans = 0;
		for (int i = 0; i < cnt.length - k; i++) {
			ans += cnt[i];
		}
		System.out.println(ans);
	}
}
