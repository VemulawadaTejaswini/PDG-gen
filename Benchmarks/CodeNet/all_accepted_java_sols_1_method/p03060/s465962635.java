import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int v[] = new int[50];
		int c[] = new int[50];

		for (int i = 0; i < N; i++) {
			v[i] = scan.nextInt();
		}
		for (int i = 0; i < N; i++) {
			c[i] = scan.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (v[i] > c[i]) {
				ans += v[i] - c[i];
			}
		}

		System.out.println(ans);
	}
}