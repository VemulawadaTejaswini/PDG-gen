
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        scan.close();

        if (x >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
