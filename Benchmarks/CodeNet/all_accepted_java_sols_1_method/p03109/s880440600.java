import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 119_a
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date d = sdf.parse(s);

            if (d.compareTo(sdf.parse("2019/04/30")) <= 0) {
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
            System.exit(1);
        }

        sc.close();
    }
}