import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String[] list = { "", "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" };

		while (true) {
			int month = sc.nextInt();
			int day = sc.nextInt();

			if (month == 0) {
				break;
			}

			GregorianCalendar calendar = new GregorianCalendar(2004, month - 1,
					day);
			System.out
					.println(list[calendar.get(GregorianCalendar.DAY_OF_WEEK)]);
		}

	}

}