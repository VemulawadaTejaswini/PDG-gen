import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int input = scanner.nextInt();
			if (input >= K) {
				ans++;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}