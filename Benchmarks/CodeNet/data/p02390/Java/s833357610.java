import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalTime time = LocalTime.ofSecondOfDay(scanner.nextInt());
		System.out.println(time.format(DateTimeFormatter.ofPattern("H:m:s")));
	}
}