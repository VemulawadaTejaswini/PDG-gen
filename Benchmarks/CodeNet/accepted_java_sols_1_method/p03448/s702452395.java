import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int x = sc.nextInt();

		int ans = 0;
		outer:
		for (int ia = 0; ia <= a; ia++) {
			int sum500 = ia * 500;
			if (sum500 > x) {
				break;
			}
			for (int ib = 0; ib <= b; ib++) {
				int sum100 = ib * 100;
				int rest = x - sum500 - sum100;
				if (rest < 0) {
					continue outer;
				}
				if (0 <= rest && rest <= c * 50) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
