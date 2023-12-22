import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long total = 0;

        int cc = c + c;
        int ab = a + b;
        int aa = a + a;
        int bb = b + b;
        while (x > 0 || y > 0) {

            if (x > 0 && y > 0) {
                if (cc < ab) {
                    total += cc;
                } else {
                    total += ab;
                }
                x -= 1;
                y -= 1;
            } else if (x > 0) {
                if (cc < a) {
                    total += cc;
                } else {
                    total += a;
                }
                x -= 1;
            } else {
                if (cc < b) {
                    total += cc;
                } else {
                    total += b;
                }
                y -= 1;
            }

        }

        System.out.println(total);

    }
}
