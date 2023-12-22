
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        for (y = 0; y < x; y++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = 0;
            int e = 0;
            int f = 0;
            if (a > b) {

                d = b;
                b = a;
                a = d;
            }
            if (b > c) {
                d = c;
                c = b;
                b = d;
            }
            if (a > b) {
                d = b;
                b = a;
                a = d;
            }
            e = a * a + b * b;
            f = c * c;
            if (e == f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

