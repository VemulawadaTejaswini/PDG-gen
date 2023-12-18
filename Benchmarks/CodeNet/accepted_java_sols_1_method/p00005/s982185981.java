
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int s;
            int g;
            int c;
            int d;
           s = a;
           g = b;
            while (a % b != 0) {
                c = a;
                a = b;
                b = c % b;

            }
            System.out.print(b);
                d = s/b*g;
                System.out.print(" ");
                System.out.println(d);
        }

    }
}
