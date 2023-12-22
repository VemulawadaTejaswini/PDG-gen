import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        int a, b, r, temp;
        long gcd;

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            gcd = (long) a * (long) b;

            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }

            do {
                r = a % b;
                a = b;
                b = r;
            } while (b != 0);

            gcd /= a;

            sb.append(a);
            sb.append(' ');
            sb.append(gcd);
            sb.append('\n');
        }

        System.out.print(sb);

    }
}