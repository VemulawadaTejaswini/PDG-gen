
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int a = 0;
            int b = a;
            int c = a;
            int d = a;
            int x = 0;

            while (d <= 9) {
                while (c <= 9) {
                    while (b <= 9) {
                        while (a <= 9) {
                            if (a + b + c + d == n) {
                                x++;
                            }
                            a++;
                        }
                        b++;
                        a = 0;
                    }
                    b = 0;
                    c++;
                }
                c = 0;
                d++;
            }
            System.out.println(x);

        }

    }
}

