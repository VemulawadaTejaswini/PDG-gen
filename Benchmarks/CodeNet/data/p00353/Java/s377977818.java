
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int f = scan.nextInt();
        int b = scan.nextInt();

        if (m >= b && m + f <= b) {
            System.out.println(b - m);
        } else {
            System.out.println("NA");
        }

    }
}

