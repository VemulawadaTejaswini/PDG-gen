import java.util.Calendar;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int month;
		int day;
	    Calendar calendar = Calendar.getInstance();

	    while(true){
	    	month = scan.nextInt();
			day = scan.nextInt();
			
			if(month == 0)break;
	    calendar.set(2004, month - 1, day);
	    dispCalendar(calendar);
	    }
	  }

	  private static void dispCalendar(Calendar calendar){
	    String[] week_name = {"Sunday", "Monday", "Tuesday", 
	                          "Wednesday", "Thursday", "Friday", "Saturday"};

	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

	    System.out.println(week_name[week]);

	  }
}