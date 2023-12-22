import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int y = sc.nextInt();
		int osatu[] = { 10000, 5000, 1000 };
		int ans[] = { -1, -1, -1 };
		for (int i = 0; i <= n; i++) {
			if (y - i * osatu[0] > 5000 * (n - i)) {
			} else {
				for (int j = 0; j + i <= n; j++) {
					if (y - i * osatu[0] - j * osatu[1] - (n - i - j) * osatu[2] == 0) {
						ans[0] = i;
						ans[1] = j;
						ans[2] = n - i - j;
					}
				}
			}
		}
		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
	}
}
