import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      	String[] ary = str.split("/", 0);
      	Calendar cal1 = Calendar.getInstance();
      	cal1.set(Integer.parseInt(ary[0]),
                Integer.parseInt(ary[1]),
                Integer.parseInt(ary[2]));
      	Calendar cal2 = Calendar.getInstance();
      	cal2.set(2019, 04, 30);
      	
      	if(cal1.before(cal2)) {
        	System.out.println("Heisei");
        } else {
        	System.out.println("TBD"); 
        }
    }
}