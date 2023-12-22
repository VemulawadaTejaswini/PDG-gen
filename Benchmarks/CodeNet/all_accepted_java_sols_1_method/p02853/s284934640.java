import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int money = 0;
		if (x == 1) {
			money += 300000;
		} else if (x == 2) {
			money += 200000;
		} else if (x == 3) {
			money += 100000;
		}
		if (y == 1) {
			money += 300000;
		} else if (y == 2) {
			money += 200000;
		} else if (y == 3) {
			money += 100000;
		}
		if (x == 1 && y == 1) {
			money += 400000;
		}
		System.out.println(money);
	}
}
