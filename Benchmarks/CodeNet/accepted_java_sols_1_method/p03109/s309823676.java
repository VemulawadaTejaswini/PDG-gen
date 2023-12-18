import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String month = s.substring(5, 7);
        if (month.equals("01") || month.equals("02") || month.equals("03") || month.equals("04")) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }

}
