import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int tmp[] = new int[4];

		tmp[0] = n / 1000;
		tmp[1] = n % 1000 / 100;
		tmp[2] = n % 1000 % 100 / 10;
		tmp[3] = n % 1000 % 100 % 10;

		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (tmp[i] == tmp[i + 1]) {
				count++;
			}
		}

		if (count >= 2 && tmp[1] == tmp[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}