
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        int d = Integer.parseInt(scan.next());
        scan.close();

        int ao = (a + d - 1) / d;
        int taka = (b + c - 1) / b;

        if (taka <= ao) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
