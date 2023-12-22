import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			int k = Integer.parseInt(sc.nextLine());
			int x = Integer.parseInt(sc.nextLine());
			int y = Integer.parseInt(sc.nextLine());

			int bill = 0;
			if (n > k) {
				bill = x * k + y * (n - k);
			} else {
				bill = x * n;
			}
			System.out.println(bill);

		} finally {
			sc.close();
		}
	}
}