import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String TBD = "TBD";
		String HEISEI = "Heisei";

		LocalDate tbdFirstDay = LocalDate.of(2019, 5, 1);

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		LocalDate dateTime = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		if (dateTime.isBefore(tbdFirstDay)) {
			System.out.println(HEISEI);
		} else {
			System.out.println(TBD);
		}

	}
}
