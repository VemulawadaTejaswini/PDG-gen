
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.next());
        int x2 = Integer.parseInt(scan.next());
        int x3 = Integer.parseInt(scan.next());
        int x4 = Integer.parseInt(scan.next());
        int x5 = Integer.parseInt(scan.next());
        scan.close();

        if (x1 == 0) {
            System.out.println(1);
        } else if (x2 == 0) {
            System.out.println(2);
        } else if (x3 == 0) {
            System.out.println(3);
        } else if (x4 == 0) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }

    }
}
