import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int t;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				t = m * i + n * j - 2 * i * j;
				if (t == k) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}