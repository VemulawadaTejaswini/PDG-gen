import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int ans = 0;
		int active = 0;
		for (int i = 0; i < N; i++) {
			if (active >= h[i]) {
				active = h[i];
			} else {
				ans += h[i] - active;
				active = h[i];
			}
		}

		System.out.println(ans);
	}
}