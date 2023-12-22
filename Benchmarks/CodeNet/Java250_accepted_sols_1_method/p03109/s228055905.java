import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		LocalDate base = LocalDate.of(2019, 4, 30);
		LocalDate input = LocalDate.of(Integer.valueOf(s.substring(0, 4)),
				Integer.valueOf(s.substring(5, 7)),
				Integer.valueOf(s.substring(8, 10)));
		System.out.println(input.isAfter(base) ? "TBD" : "Heisei");
	}
}