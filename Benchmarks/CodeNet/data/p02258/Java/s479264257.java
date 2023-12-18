import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int[] R = new int[n];
		for (int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		int min = R[0];
		int ans = -Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			ans = Math.max(ans, R[i] - min);
			min = Math.min(min, R[i]);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}