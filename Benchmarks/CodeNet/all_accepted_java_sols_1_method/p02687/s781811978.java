import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String lastWeek = scan.next();
		
		if(lastWeek.equals("ABC")) {
			System.out.println("ARC");
		}else {
			System.out.println("ABC");
		}
		
	}
}