
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i != n; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d;

            if (a < b) {
                d = a;
                a = b;
                b = d;
            }
            if (b < c) {
                d = b;
                b = c;
                c = d;
            }
            if (a < b) {
                d = a;
                a = b;
                b = d;
            }
            if (a * a == b * b + c * c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

