import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int k0, k10, k20, k30, k40, k50, k60;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			k0 = k10 = k20 = k30 = k40 = k50 = k60 = 0;
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				if (k < 10) {
					k0++;
				} else if (k < 20) {
					k10++;
				} else if (k < 30) {
					k20++;
				} else if (k < 40) {
					k30++;
				} else if (k < 50) {
					k40++;
				} else if (k < 60) {
					k50++;
				} else {
					k60++;
				}
			}
			System.out.println(k0);
			System.out.println(k10);
			System.out.println(k20);
			System.out.println(k30);
			System.out.println(k40);
			System.out.println(k50);
			System.out.println(k60);
		}
	}
}