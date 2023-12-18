import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money;
		int n;

		n = sc.nextInt();
		money = 100000;
		for (int i = 0; i < n; i++) {
			money *= 1.05;
			money = (money % 1000 == 0) ? money : money - money % 1000 + 1000;
		}
		System.out.println(money);
	}
}