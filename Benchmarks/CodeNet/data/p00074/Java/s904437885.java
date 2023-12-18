import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();

				if (h == -1 && m == -1 && s == -1) {
					break;
				}

			int sum = 3600 * h + 60 * m + s;
			sum /= 3;

			LocalTime l1 = LocalTime.of(h, m, s);
			LocalTime l2 = LocalTime.of(sum / 3600, sum / 60 % 60, sum % 60);
			LocalTime l = LocalTime.of(2, 0, 0);

			Duration d = Duration.between(l1, l);
			Duration t = Duration.between(l2, l);
			System.out.printf("%02d:%02d:%02d\n", d.toHours(), d.toMinutes() % 60, d.getSeconds() % 60);
			System.out.printf("%02d:%02d:%02d\n", t.toHours(), t.toMinutes() % 60, t.getSeconds() % 60);
		}
		sc.close();
	}
}
