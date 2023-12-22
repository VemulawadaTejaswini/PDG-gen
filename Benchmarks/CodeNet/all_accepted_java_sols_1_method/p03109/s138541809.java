import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] ymd = S.split("/");
        int year = Integer.parseInt(ymd[0]);
        int month = Integer.parseInt(ymd[1]);

        if(year < 2019){
            System.out.println("Heisei");
        } else if(year == 2019){
            if(month < 5){
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }
        } else {
            System.out.println("TBD");
        }


    }
}
