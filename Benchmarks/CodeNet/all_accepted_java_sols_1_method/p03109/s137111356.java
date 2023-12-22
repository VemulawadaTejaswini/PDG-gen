import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.compareTo("2019/04/30") > 0) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
        try {
            Date date1 = DateFormat.getDateInstance().parse(S);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
