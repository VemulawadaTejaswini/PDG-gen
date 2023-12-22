import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int buttons[] = new int[2];
		int maxCoins = 0;

		for (int i = 0; i < 2; i++) {
			buttons[0] = a;
			buttons[1] = b;

			int getCoins1 = buttons[i]--;
			int getCoins2 = 0;

			for (int j = 0; j < 2; j++) {
				if (buttons[j] > getCoins2) {
					getCoins2 = buttons[j];
				}
			}

			if (getCoins1 + getCoins2 > maxCoins) {
				maxCoins = getCoins1 + getCoins2;
			}
		}

		System.out.println(maxCoins);

		sc.close();
	}
}
