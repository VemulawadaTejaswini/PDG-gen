import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int m = s.nextInt();
			int p = s.nextInt();

			if (n == 0 && m == 0 && p == 0)
				break;

			int[] participant = new int[n];
			int bet = 0;
			int payment = 0;

			for (int i = 0; i < n; i++) {
				participant[i] = s.nextInt();
				bet += participant[i] * 100;
			}

			if (participant[m - 1] != 0) {
				payment = (bet - bet * p / 100) / participant[m - 1];
			}
			System.out.println(payment);
		}
		s.close();
	}
}