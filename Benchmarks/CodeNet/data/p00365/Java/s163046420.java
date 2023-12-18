import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LocalDate d1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		LocalDate d2 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

		System.out.println(Period.between(d1, d2).getYears() + 1);
		sc.close();
	}

}
