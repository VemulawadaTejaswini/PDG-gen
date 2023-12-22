import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        if (A.equals("SUN")) {
            System.out.print(7);
        } else if (A.equals("MON")) {
            System.out.print(6);
        } else if (A.equals("TUE")) {
            System.out.print(5);
        } else if (A.equals("WED")) {
            System.out.print(4);
        } else if (A.equals("THU")) {
            System.out.print(3);
        } else if (A.equals("FRI")) {
            System.out.print(2);
        } else {
            System.out.print(1);
        }
    }
}
