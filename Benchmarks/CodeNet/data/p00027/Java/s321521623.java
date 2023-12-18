import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		while(scan.hasNext()){
			int mon = scan.nextInt();
			int day = scan.nextInt();
			if(mon == 0){
				break;
			}
			int year = 2004;
			Calendar cal = Calendar.getInstance();
			cal.set(2004, mon - 1, day);
			int week = cal.get(Calendar.DAY_OF_WEEK);
			String s = "";
			switch(week){
				case Calendar.SUNDAY :
					s = "Sunday";
					break;
				case Calendar.MONDAY :
					s = "Monday";
					break;
				case Calendar.TUESDAY :
					s = "Tuesday";
					break;
				case Calendar.WEDNESDAY :
					s = "Wednesday";
					break;
				case Calendar.THURSDAY :
					s = "Thursday";
					break;
				case Calendar.FRIDAY :
					s = "Friday";
					break;
				case Calendar.SATURDAY :
					s = "Saturday";
					break;
				default :
					break;
			}
			System.out.printf("%s\n", s);
		}
	}
}