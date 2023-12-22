import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int sum = A + B + C;

		int max = Math.max(A, B);
		max = Math.max(max, C);

		int kouho1 = max * 3;
		int kouho2 = (max + 1) * 3;

		int ans = 0;
		if (sum % 2 == kouho1 % 2) {
			ans = (kouho1 - sum) / 2;
		} else {
			ans = (kouho2 - sum) / 2;
		}

		System.out.println(ans);

	}
}
