import java.util.Calendar;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2004);

		while (sc.hasNext()) {
			int m = sc.nextInt(), d = sc.nextInt();
			if (m == 0 && d == 0) break;
			cal.set(Calendar.MONTH, m-1);
			cal.set(Calendar.DAY_OF_MONTH, d);
			int w = cal.get(Calendar.DAY_OF_WEEK);
			switch (w) {
			case Calendar.SUNDAY: System.out.println("Sunday"); break;
			case Calendar.MONDAY: System.out.println("Monday"); break;
			case Calendar.TUESDAY: System.out.println("Tuesday"); break;
			case Calendar.WEDNESDAY: System.out.println("Wednesday"); break;
			case Calendar.THURSDAY: System.out.println("Thursday"); break;
			case Calendar.FRIDAY: System.out.println("Friday"); break;
			case Calendar.SATURDAY: System.out.println("Saturday"); break;
			}
		}
	}
}