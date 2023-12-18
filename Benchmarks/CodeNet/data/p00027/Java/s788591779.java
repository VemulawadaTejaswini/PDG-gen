import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            while((line = br.readLine()) != null) {
            		String[] list = line.split(" ", 0);
            		int month = Integer.parseInt(list[0]);
            		int day = Integer.parseInt(list[1]);
            		if(month == 0 && day == 0) {
            			break;
            		}
            		String date = tellMeDate(month, day);
            		System.out.println(date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   private static String tellMeDate(int month, int day) {
	   
	   Calendar cal = Calendar.getInstance();
	   int year = 2014;
	   cal.set(year, month, day);
	   int dayChecker = 0;
	   switch (cal.get(Calendar.DAY_OF_WEEK)) { 
	    case Calendar.SUNDAY:
	    		dayChecker = 0;
	    		break;
	    case Calendar.MONDAY:  
	        //????????\
	    	dayChecker = 1;
	    		break;
	    case Calendar.TUESDAY: 
	        //????????\
	    	dayChecker = 2;
	        break;
	    case Calendar.WEDNESDAY: 
	        //?°´?????\
	    	dayChecker = 3;
	        break;
	    case Calendar.THURSDAY:
	        //??¨?????\
	    	dayChecker = 4;
	        break;
	    case Calendar.FRIDAY:
	        //????????\
	    	dayChecker = 5;
	        break;
	    case Calendar.SATURDAY:
	        //????????\
	    	dayChecker = 6;
	        break;
	}
	   List<String> whatDate = new ArrayList<>();
	   whatDate.add("Sunday");
	   whatDate.add("Monday");
	   whatDate.add("Tuesday");
	   whatDate.add("Wednesday");
	   whatDate.add("Thursday");
	   whatDate.add("Friday");
	   whatDate.add("Saturday");
	   
	   String a = whatDate.get(dayChecker);
	   return a;
   }
}