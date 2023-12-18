
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long x = a;
            long y = b;
            long z;
            while (x % y != 0) {
                z = x;
                x = y;
                y = z % x;
            }
            System.out.println(y + " " + a / y * b);
        }
    }
}

