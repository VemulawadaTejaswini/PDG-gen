import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.compareTo("2019/04/30") > 0) {
            System.out.println("TBD");
        }
        else {
            System.out.println("Heisei");
        }
    }
}
