import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int months = sc.nextInt();
		int days = sc.nextInt();

		int ans = 0;
		for (int m = 1; m <= months; m++) {
			for (int d = 10; d <= days; d++) {
				int d1 = d % 10;
				int d10 = d / 10;
				if (d10 >= 2 && d1 >= 2 && m == d1 * d10) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
