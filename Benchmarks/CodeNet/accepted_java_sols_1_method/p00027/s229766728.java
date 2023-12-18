import java.time.LocalDate;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] line = sc.nextLine().split(
					" ");

			if ("0".equals(line[0])) {
				System.exit(0);
			}

			int month = Integer.parseInt(line[0]);
			int day = Integer.parseInt(line[1]);

			LocalDate ld = LocalDate.of(2004,
					month, day);

			String outString = ld.getDayOfWeek()
					.toString();

			System.out.println(Character
					.toTitleCase(outString.charAt(
							0)) + outString
									.substring(1)
									.toLowerCase());

		}
	}
}