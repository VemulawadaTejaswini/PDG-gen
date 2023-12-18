
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = Integer.parseInt(scan.next());
        int t = Integer.parseInt(scan.next());
        int s = Integer.parseInt(scan.next());
        scan.close();

        if (t * s >= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
