import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);) {
			
			int seconds = sc.nextInt();
			
			LocalTime time = LocalTime.ofSecondOfDay(seconds);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m:s");
			
			System.out.println(time.format(formatter));
		}
		
	}

}
