import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			int m = sc.nextInt();
			int d = sc.nextInt();

				if (m == 0) {
					break;
				} else {
					dispDoW(m, d);
				}
		}

	}
	private static void dispDoW(int m, int d) {
		LocalDate date = LocalDate.of(2004, m, d);

		switch (date.getDayOfWeek()) {
			case SUNDAY:
				System.out.println("Sunday");
			break;
			case MONDAY:
				System.out.println("Monday");
			break;
			case TUESDAY:
				System.out.println("Tuesday");
			break;
			case WEDNESDAY:
				System.out.println("Wednesday");
			break;
			case THURSDAY:
				System.out.println("Thursday");
			break;
			case FRIDAY:
				System.out.println("Friday");
			break;
			case SATURDAY:
				System.out.println("Saturday");
			break;

		}


	}

}
