import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main (String [] a){
		//set constraints and var
		int minWeek = 0;
		int maxWeek = 100;
		double initialDebt = 100000;
		double debt = 0;
		
		//get number of weeks
		Scanner in = new Scanner(System.in);
		System.out.print("Number of weeks: ");
		try {
			int numWeeks = in.nextInt();
			
			if(numWeeks >= minWeek && numWeeks <= maxWeek){
				debt = initialDebt;
				
				if (numWeeks == 0){
				} else {
					for (int i=0; i<numWeeks; i++){
						debt = debt * 1.05;
						if(debt%1000 == 0){
						} else {
							debt = (debt - (debt%1000)) + 1000;
						}
					}
				}
				
				System.out.println("Total debt:" + (int)debt);
			} else {
				System.out.println("Invalid number");
			}	
		}  catch (InputMismatchException e){
			System.out.println("Invalid input");
		}
	}
	
}