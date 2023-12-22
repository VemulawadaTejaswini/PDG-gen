import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0, tmp = i;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			if (a <= sum && sum <= b) {
				ans += i;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
