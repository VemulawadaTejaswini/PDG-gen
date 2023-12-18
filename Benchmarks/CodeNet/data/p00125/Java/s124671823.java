import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int y1, m1, d1, y2, m2, d2;
		Scanner sc = new Scanner(System.in);
		while(true) {
			y1 = sc.nextInt();
			m1 = sc.nextInt();
			d1 = sc.nextInt();
			y2 = sc.nextInt();
			m2 = sc.nextInt();
			d2 = sc.nextInt();
			if(y1 == -1) break;
			LocalDateTime t1 = LocalDateTime.of(y1, m1, d1, 0, 0);
			LocalDateTime t2 = LocalDateTime.of(y2, m2, d2, 0, 0);
			Duration dur = Duration.between(t1, t2);
			System.out.println(dur.toDays());
		}
	}

}

