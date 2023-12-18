import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double ans = sc.nextDouble();
			double x = ans * 2; // S(2)
			ans += x;
			// S(3)??\???
			for (int i = 3; i <= 10; i++) {
				if (i % 2 == 0) {
					x = x* 2;
					ans += x;
				} else {
					x = x/ 3;
					ans += x;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}