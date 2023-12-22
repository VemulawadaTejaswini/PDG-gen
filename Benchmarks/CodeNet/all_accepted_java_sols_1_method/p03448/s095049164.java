import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int x = sc.nextInt();

		int ans = 0;
		outerA:
		for (int ia = 0; ia <= a; ia++) {
			int sum500 = ia * 500;
			if (sum500 > x) {
				break;
			}
			outerB:
			for (int ib = 0; ib <= b; ib++) {
				int sum100 = ib * 100;
				if (sum500 + sum100 > x) {
					continue outerA;
				}
				for (int ic = 0; ic <= c; ic++) {
					int sum50 = ic * 50;
					int sum = sum500 + sum100 + sum50;
					if (sum > x) {
						continue outerB;
					}
					if (sum == x) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
