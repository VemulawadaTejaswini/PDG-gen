
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int date = scanner.nextInt();

			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month - 1, date);
			Calendar heisei = Calendar.getInstance();
			heisei.set(1989, 0, 8);
			Calendar syowa = Calendar.getInstance();
			syowa.set(1926, 11, 25);
			Calendar taisho = Calendar.getInstance();
			taisho.set(1912, 6, 30);
			Calendar meiji = Calendar.getInstance();
			meiji.set(1868, 8, 8);

			if (calendar.compareTo(heisei) >= 0) {
				System.out.println(String.format("heisei %d %d %d", year
						- heisei.get(Calendar.YEAR) + 1, month, date));
			} else if (calendar.compareTo(syowa) >= 0) {
				System.out.println(String.format("syowa %d %d %d",
						year - syowa.get(Calendar.YEAR) + 1, month, date));
			} else if (calendar.compareTo(taisho) >= 0) {
				System.out.println(String.format("taisyo %d %d %d", year
						- taisho.get(Calendar.YEAR) + 1, month, date));
			} else if (calendar.compareTo(meiji) >= 0) {
				System.out.println(String.format("meiji %d %d %d",
						year - meiji.get(Calendar.YEAR) + 1, month, date));
			} else {
				System.out.println("pre-meiji");
			}
		}
	}
}