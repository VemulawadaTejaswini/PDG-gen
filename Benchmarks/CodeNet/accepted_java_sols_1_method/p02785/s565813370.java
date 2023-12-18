import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		long ans = 0;
		for (int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		for (int i = 0; i < n-k; i++) {
			ans += h[i];
		}
		System.out.println(ans);
	}
}