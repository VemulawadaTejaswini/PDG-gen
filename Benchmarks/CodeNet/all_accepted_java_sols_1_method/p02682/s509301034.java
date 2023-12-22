
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.close();

        if (k <= a) {
            System.out.println(k);
        } else if (k <= a + b) {
            System.out.println(a);
        } else {
            System.out.println(a - (k - a - b));
        }

    }
}
