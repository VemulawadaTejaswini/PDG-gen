import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i = l; i <= r; i++) {
			if (i % d == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
