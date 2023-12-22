import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] ymd = s.split("/");
        int month = Integer.parseInt(ymd[1]);
        int day = Integer.parseInt(ymd[2]);
        if (month < 4) {
            System.out.println("Heisei");
        } else if (month == 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
