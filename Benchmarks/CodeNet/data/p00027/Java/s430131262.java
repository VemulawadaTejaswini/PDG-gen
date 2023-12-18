import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = 2004;
		int month;
		int day;

		while ((month = (scan.nextInt())) != 0) {
			day = scan.nextInt();

			GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
			System.out.println(getWeek(calendar));

		}
	}

	private static String getWeek(GregorianCalendar calendar) {
		String week = null;
		if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
			week = "Sunday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 2) {
			week = "Monday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 3) {
			week = "Tuesday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 4) {
			week = "Wednesday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 5) {
			week = "Thursday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 6) {
			week = "Friday";
		} else if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
			week = "Saturday";
		}
		return week;

	}
}