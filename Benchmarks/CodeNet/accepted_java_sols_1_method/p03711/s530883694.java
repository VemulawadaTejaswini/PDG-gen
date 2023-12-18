import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();

        if (x.matches("1|3|5|7|8|10|12") && y.matches("1|3|5|7|8|10|12")) {
            System.out.println("Yes");
        } else if (x.matches("4|6|9|11") && y.matches("4|6|9|11")) {
            System.out.println("Yes");
        } else if (x.matches("2") && y.matches("2")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}