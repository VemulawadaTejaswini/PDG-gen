//Volume0-0027
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	//declare
    	Calendar cl  = Calendar.getInstance();
    	String   ans;
    	int      month,day;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		month = sc.nextInt();
    		day   = sc.nextInt();
    		if(month==0){break;}
    		cl.set(2004,--month,day);
    		
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