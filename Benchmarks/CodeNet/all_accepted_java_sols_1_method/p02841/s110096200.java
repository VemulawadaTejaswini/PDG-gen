import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int[] day1 = new int[2];
		int[] day2 = new int[2];

		for (int i = 0; i < day1.length; i++) {
			day1[i] = scanner.nextInt();
		}
		for (int i = 0; i < day2.length; i++) {
			day2[i] = scanner.nextInt();
		}
		scanner.close();

		LocalDate day11 = LocalDate.of(2019, day1[0], day1[1]);
		LocalDate day22 = LocalDate.of(2019, day2[0], day2[1]);

		if (day2[0]> day1[0]) {
			if(day11.plusDays(1).equals(day22)) {
				System.out.println("1");
			}
		}else {
			System.out.println("0");
		}
	}
}