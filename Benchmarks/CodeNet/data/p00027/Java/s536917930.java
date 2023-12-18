//Volume0-0027
import java.util.*;

public class Main {
	
	//declare
  	private static final int END = 0;
	
    public static void main(String[] args) {

    	Calendar cl  = Calendar.getInstance();
    	String   ans;
    	String[] s;
    	int      month,
         	     date;

    	//initialize
    	cl.set(Calendar.YEAR,2004);
    	
    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		s     = sc.nextLine().split("\\s");
    		month = Integer.parseInt(s[0]);
    		if(month==END){break;}
    		month--;
    		date  = Integer.parseInt(s[1]);
    		cl.set(Calendar.MONTH, month);
    		cl.set(Calendar.DATE, date);
    		
    		//calculate
    		ans = "";
    		switch (cl.get(Calendar.DAY_OF_WEEK)){
    			case (Calendar.MONDAY)   :{ans = "Monday";   break;}
    			case (Calendar.TUESDAY)  :{ans = "Tuesday";  break;}
    			case (Calendar.WEDNESDAY):{ans = "Wednesday";break;}
    			case (Calendar.THURSDAY) :{ans = "Thursday"; break;}
    			case (Calendar.FRIDAY)   :{ans = "Friday";   break;}
    			case (Calendar.SATURDAY) :{ans = "Saturday"; break;}
    			case (Calendar.SUNDAY)   :{ans = "Sunday";         }
    		}
    		//output
    		System.out.println(ans);
    	}
    }
}