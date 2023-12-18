import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Main {

	private static final int YEAR = 2004;
	private static final String SUNDAY = "Sunday";
	private static final String MONDAY = "Monday";
	private static final String TUESDAY = "Tuesday";
	private static final String WEDNESDAY = "Wednesday";
	private static final String THURSDAY = "Thursday";
	private static final String FRIDAY = "Friday";
	private static final String SATURDAY = "Saturday";

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextInt()) {
				int month = sc.nextInt();
				int day = sc.nextInt();
				if (month == 0 || day == 0) {
					break;
				}

				System.out.println(getDayOfTheWeek(month, day));

			}
		}
	}

	private static String getDayOfTheWeek(int m, int d) {
		Calendar calendar = new GregorianCalendar(YEAR, m - 1, d);

		String dayOfTheWeek = null;
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			dayOfTheWeek = SUNDAY;
			break;
		case Calendar.MONDAY:
			dayOfTheWeek = MONDAY;
			break;
		case Calendar.TUESDAY:
			dayOfTheWeek = TUESDAY;
			break;
		case Calendar.WEDNESDAY:
			dayOfTheWeek = WEDNESDAY;
			break;
		case Calendar.THURSDAY:
			dayOfTheWeek = THURSDAY;
			break;
		case Calendar.FRIDAY:
			dayOfTheWeek = FRIDAY;
			break;
		case Calendar.SATURDAY:
			dayOfTheWeek = SATURDAY;
			break;
		}
		return dayOfTheWeek;
	}
}