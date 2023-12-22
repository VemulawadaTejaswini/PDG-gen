
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

    }
}
