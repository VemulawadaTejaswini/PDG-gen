import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
		Scanner sc = new Scanner(System.in);
        String dateStr = sc.next();
        
        Date date1 = sdf.parse(dateStr);
        Date date2 = sdf.parse("2019/04/30");
        
        if (date1.compareTo(date2) > 0) {
            System.out.println("TBD");
        }else {
        	System.out.println("Heisei");
        }
	}
}
