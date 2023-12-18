import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = Math.max(a, b);
		max = Math.max(max, c);
		int sum = a + b + c;

		int ans1 = max * 3;
		int ans2 = (1 + max) * 3;

		if (sum % 2 == ans1 % 2) {
			System.out.println((ans1 - sum) / 2);
		} else {
			System.out.println((ans2 - sum) / 2);
		}

	}
}
