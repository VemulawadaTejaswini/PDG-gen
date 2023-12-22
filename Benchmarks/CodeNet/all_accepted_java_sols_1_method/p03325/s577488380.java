import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			while (a % 2 == 0) {
				ans++;
				a /= 2;
			}
		}
		sc.close();

		System.out.println(ans);
	}
}
