import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String lastWeekContest = scan.next();

		if (lastWeekContest.equals("ABC")) {
			System.out.print("ARC");
		} else {
			System.out.print("ABC");
		}

	}

}
