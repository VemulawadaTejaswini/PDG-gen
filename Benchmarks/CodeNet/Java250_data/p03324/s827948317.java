import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int n = sc.nextInt();

		if (n == 100) {
			n = 101;
		}
		switch (d) {
		case 0:
			System.out.println(n);
			break;

		case 1:
			System.out.println(n * 100);
			break;

		case 2:
			System.out.println(n * 10000);
		}

	}
}