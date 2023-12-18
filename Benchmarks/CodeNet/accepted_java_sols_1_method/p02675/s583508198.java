
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int a = n % 10;

        if (a == 3) {
            System.out.println("bon");
        } else if (a == 0 || a == 1 || a == 6 || a == 8) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }

    }

}
