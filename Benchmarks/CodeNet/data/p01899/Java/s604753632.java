import java.util.Scanner;

/**
 * Yamanote-line Game
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		int N, d;
		N = sc.nextInt();
		d = sc.nextInt();

		int ans = 0;

		for (int i = 0; i < N; i++) {
			ans += Math.max(sc.nextInt() - d, 0);
		}

		System.out.println(ans > 0 ? ans : "kusoge");
	}
}