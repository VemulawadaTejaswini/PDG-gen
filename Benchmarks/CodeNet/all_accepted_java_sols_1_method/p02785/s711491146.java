import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(h);
		long ans = 0;
		for (int i = 0; i < n - k; i++) {
			ans += h[i];
		}
		System.out.println(ans);
	}
}
