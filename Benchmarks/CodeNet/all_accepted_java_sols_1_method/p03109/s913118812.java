import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      	
      Scanner sc = new Scanner(System.in);	      
	  String sdate = sc.next();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd");
            LocalDate date = LocalDate.parse(sdate, formatter);
            LocalDate today = LocalDate.of(2019, 4, 30);
            int diff = date.compareTo(today);
            if (diff <= 0  ){
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }
        } catch (DateTimeParseException e) {
            System.out.println("入力値がyyyy/mm/dd形式ではありません");
        }
    }

}