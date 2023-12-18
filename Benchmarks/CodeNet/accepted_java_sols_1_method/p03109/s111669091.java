import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try { 
            Scanner scanner = new Scanner(System.in);
            String input_str = scanner.next();
            scanner.close();
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date input_date = sdFormat.parse(input_str);
            Date standard_date = sdFormat.parse("2019/04/30");
            if (input_date.compareTo(standard_date) > 0) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    Main() {
    }
}
