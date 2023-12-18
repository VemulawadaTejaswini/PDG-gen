import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		getCoins();
	}

	public static void getCoins() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int coins = 0;
		int days = 0;
		while (coins < C) {
			days++;
			coins += A;
			if (days % 7 == 0) {
				coins += B;
			}
		}
		System.out.println(days);
	}
}

