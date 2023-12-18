import java.io.*;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            
            String line; // ??\???????????????????????\???
            while ((line = br.readLine()) != null){
            	String[] date = line.split(" ",0);
                int month = Integer.parseInt(date[0]);
                int day = Integer.parseInt(date[1]);
            	if(month==0){
                break;
                }
            	System.out.println(getDay(month, day));
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getDay(int month, int day) {
    	Calendar cal = Calendar.getInstance();
        cal.set(2004, month - 1, day);
    
    switch (cal.get(Calendar.DAY_OF_WEEK)) { 
    case Calendar.SUNDAY:     // Calendar.SUNDAY:1 ???????????????????????????
    	return "Sunday";
    case Calendar.MONDAY:     // Calendar.MONDAY:2
    	return "Monday";
    case Calendar.TUESDAY:    // Calendar.TUESDAY:3
    	return "Tuesday";
    case Calendar.WEDNESDAY:  // Calendar.WEDNESDAY:4
    	return "Wednesday";
    case Calendar.THURSDAY:   // Calendar.THURSDAY:5
    	return "Thursday";
    case Calendar.FRIDAY:     // Calendar.FRIDAY:6
    	return "Friday";
    case Calendar.SATURDAY:   // Calendar.SATURDAY:7
    	return "Saturday";
}
	return null;
    }
}