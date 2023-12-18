import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			while(sc.hasNext()) {
				int y1 = sc.nextInt();
				int m1 = sc.nextInt();
				int d1 = sc.nextInt();
				int y2 = sc.nextInt();
				int m2 = sc.nextInt();
				int d2 = sc.nextInt();

				if (y1 <= -1 || m1 <= -1 || d1 <= -1 ||
						y2 <= -1 || m2 <= -1 || d2 <= -1) {
					break;
				}

				LocalDateTime ld1 = LocalDateTime.of(y1, m1, d1, 0, 0, 0, 0);
				LocalDateTime ld2 = LocalDateTime.of(y2, m2, d2, 0, 0, 0, 0);

				Duration res = Duration.between(ld1, ld2);

				System.out.println(res.toDays());
			}
		sc.close();
	}

}
