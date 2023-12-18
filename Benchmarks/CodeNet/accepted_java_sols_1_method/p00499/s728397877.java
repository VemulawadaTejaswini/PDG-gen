import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int daysOfWinterVacation;
		double pagesOfLangDrill, pagesOfMathDrill, pagesOfLangADay, pagesOfMathADay;
		int langDays, mathDays;
		daysOfWinterVacation = sc.nextInt();
		pagesOfLangDrill = sc.nextDouble();
		pagesOfMathDrill = sc.nextDouble();
		pagesOfLangADay = sc.nextDouble();
		pagesOfMathADay = sc.nextDouble();

		
		langDays = (int)Math.ceil(pagesOfLangDrill / pagesOfLangADay);
		mathDays = (int)Math.ceil(pagesOfMathDrill / pagesOfMathADay);
		if (langDays > mathDays) {
			System.out.println(daysOfWinterVacation - langDays);
		}else {
			System.out.println(daysOfWinterVacation - mathDays);
		}
	}

}