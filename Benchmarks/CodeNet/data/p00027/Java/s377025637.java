import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	static Map<Integer, Integer> monthDay = null;
	static String[] dayOfTheWeek = { "Wednesday", "Thursday", "Friday",
			"Saturday", "Sunday", "Monday", "Tuesday" };

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int month = sc.nextInt();
				int day = sc.nextInt();
				if (month == 0 || day == 0) {
					break;
				}
				if (monthDay == null) {
					createMonth();
				}
				System.out.println(getDayOfTheWeek(month, day, monthDay));

			}

		} finally {
			sc.close();
		}

	}

	public static String getDayOfTheWeek(int m, int d, Map<Integer, Integer> map) {

		int sum = 0;
		for (int i = 1; i < m; i++) {
			sum += map.get(i);
		}
		sum += d;

		return dayOfTheWeek[sum % 7];
	}

	public static Map<Integer, Integer> createMonth() {
		monthDay = new HashMap<Integer, Integer>();
		monthDay.put(1, 31);
		monthDay.put(2, 29);
		monthDay.put(3, 31);
		monthDay.put(4, 30);
		monthDay.put(5, 31);
		monthDay.put(6, 30);
		monthDay.put(7, 31);
		monthDay.put(8, 31);
		monthDay.put(9, 30);
		monthDay.put(10, 31);
		monthDay.put(11, 30);
		monthDay.put(12, 31);

		return monthDay;

	}

}