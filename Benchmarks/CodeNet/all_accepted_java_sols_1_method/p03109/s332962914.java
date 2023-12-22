import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			LocalDate date = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
			LocalDate date0430 = LocalDate.of(2019, 4, 30);
			System.out.println((date.isAfter(date0430)) ? "TBD" : "Heisei");
		}
	}
}
