import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.next();
        String[] date_split = dateStr.split("/");
        int year = Integer.parseInt(date_split[0]);
        int month = Integer.parseInt(date_split[1]);
        int day = Integer.parseInt(date_split[2]);

        boolean past = true;
        if(year > 2019) past = false;
        if(year == 2019) {
            if(month > 4) past = false;
            if(month == 4) {
                if(day > 30) past = false;
            }
        }

        System.out.println(past?"Heisei":"TBD");
    } 
}