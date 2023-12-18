
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        scan.close();

        int min = 2 * x;
        int max = 4 * x;

        if (min <= y && y <= max && y % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
