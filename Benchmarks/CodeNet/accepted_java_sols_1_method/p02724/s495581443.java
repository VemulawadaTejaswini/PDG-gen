import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		sc.close();

		int happy = 0;

		if (money / 500 > 0) {
			happy += 1000 * (money / 500);
			money -= 500 * (money / 500);
		}
		if (money / 5 > 0) {
			happy += 5 * (money / 5);
			money -= 5 * (money / 5);
		}

		System.out.print(happy);
	}

}
