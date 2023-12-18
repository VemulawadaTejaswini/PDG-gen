import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		long money;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			money = 0L;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				int w = sc.nextInt();
				int k = x + y + z;
				
				if (k <= 60 && w <= 2) {
					money += 600L;
				} else if (k <= 80 && w <= 5) {
					money += 800L;
				} else if (k <= 100 && w <= 10) {
					money += 1000L;
				} else if (k <= 120 && w <= 15) {
					money += 1200L;
				} else if (k <= 140 && w <= 20) {
					money += 1400L;
				} else if (k <= 160 && w <= 25) {
					money += 1600L;
				}
			}
			System.out.println(money);
		}
	}
}