import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day ={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a ==0)break;
            GregorianCalendar gre = new GregorianCalendar(2004,a-1,b);
            System.out.println(day[gre.get(GregorianCalendar.DAY_OF_WEEK)]);
        }

    }
}