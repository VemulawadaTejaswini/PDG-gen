import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			Integer H1 = scanner.nextInt();
			Integer M1 = scanner.nextInt();
			Integer H2 = scanner.nextInt();
			Integer M2 = scanner.nextInt();
			Integer K = scanner.nextInt();

			Integer hour = H2 - H1;
			Integer minute = M2 - M1;
			if (hour < 0) {
				hour = 24 + hour;
			}
			if (minute < 0) {
				hour--;
				minute = 60  + minute;
			}
			Integer totalMinute = hour * 60 + minute;
			System.out.print(totalMinute - K);
		}
	}
}
