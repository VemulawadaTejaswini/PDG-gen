import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		System.out.println(LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.JAPAN)).compareTo(LocalDate.of(2019, 4, 30)) <= 0 ? "Heisei" : "TBD");
	}
	
}
