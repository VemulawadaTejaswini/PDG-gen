import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		int ans;
		for (int i = 1; i < 2 * k; i++) {

			ans = x - k + i;

			System.out.println(ans);

		}
	}
}