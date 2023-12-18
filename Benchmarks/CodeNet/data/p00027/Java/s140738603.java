import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            
            if (month == 0 || day ==0) {
                break;
            }

            Calendar calendar = new GregorianCalendar(2004, month-1, day);
            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.MONDAY :
                    System.out.println("Monday");
                    break;
                case Calendar.TUESDAY :
                    System.out.println("Tuesday");
                    break;
                case Calendar.WEDNESDAY :
                    System.out.println("Wednesday");
                    break;
                case Calendar.THURSDAY :
                    System.out.println("Thursday");
                    break;
                case Calendar.FRIDAY :
                    System.out.println("Friday");
                    break;
                case Calendar.SATURDAY :
                    System.out.println("Saturday");
                    break;
                case Calendar.SUNDAY :
                    System.out.println("Sunday");
                    break;
            }
        }            
    }        
}