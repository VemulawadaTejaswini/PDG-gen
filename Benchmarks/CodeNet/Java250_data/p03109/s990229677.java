import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String date = scanner.next();
		
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		
		if(year <= 2019 && month <= 04) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
		
	}
}