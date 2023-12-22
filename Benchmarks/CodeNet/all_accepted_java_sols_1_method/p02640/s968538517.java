import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int crane = 0;
		int turtle = x * 4;

		while (turtle >= 0) {
			if (crane + turtle == y) {
				System.out.println("Yes");
				System.exit(0);
			}
			turtle -= 4;
			crane += 2;
		}
		System.out.println("No");
	}

}
