

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();



//        if (date.equals(LocalDate.of(2019, 4, 30))) {
//            System.out.println("Heisei");
//        } else if (date.isBefore(LocalDate.of(2019, 4, 30))) {
//            System.out.println("Heisei");
//        } else {
//            System.out.println("TBD");
//        }

        int y = Integer.parseInt(s.substring(0, 4));
        int m = Integer.parseInt(s.substring(5, 7));
        int d = Integer.parseInt(s.substring(8, 10));

        if (y == 2019 && m == 4 && d == 30) {
            System.out.println("Heisei");
            return;
        }

        if (y > 2019) {
            System.out.println("TBD");
            return;
        }
        if (y == 2019 && m > 4) {
            System.out.println("TBD");
            return;
        }
        System.out.println("Heisei");

    }
}
