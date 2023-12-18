import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int K = sc.nextInt();
	static int[] h = new int[N];
	static {
		Arrays.setAll(h, i->sc.nextInt());
	}
	public static void main(String[] args) {
		Arrays.sort(h);
		int ans = h[K-1] - h[0];
		for (int i = 0; i <= N - K; i++) {
			ans = Math.min(ans, h[i+K-1] - h[i]);
		}
		System.out.println(ans);
	}
}
