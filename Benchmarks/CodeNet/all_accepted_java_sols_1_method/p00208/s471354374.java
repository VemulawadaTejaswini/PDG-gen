import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            long n = sc.nextLong();
            if (n == 0) {
                break;
            }
            long r = n;
            long a1 = 3;
            long a2 = 4;
            long b = 8;
            long c = 1;
            while(n > a1) {
                r += (n + a1) / b * c;
                r += (n + a2) / b * c;
                a1 *= 8;
                a2 *= 8;
                b *= 8;
                c *= 10;
            }
            System.out.println(r);
        }
    }
}

