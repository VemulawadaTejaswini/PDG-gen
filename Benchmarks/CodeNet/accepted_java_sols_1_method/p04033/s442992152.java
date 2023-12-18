import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int minus = 0;
		boolean zero = false;
		for (int i = a; i <= b; i++) {
			if (i < 0) minus++;
			if (i == 0) zero = true;
		}

		if (zero) {
			System.out.println("Zero");
		} else if (minus % 2 == 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

		sc.close();
	}

}
