import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        // 1 double b = sc.nextDouble();
        String b = sc.next();

        // 1 long ans = (long)(a*b);

        // 2 long b0 = b.charAt(0) - '0';
        // 2 long b1 = b.charAt(2) - '0';
        // 2 long b2 = b.charAt(3) - '0';

        // 2 long ans = a * b0 + a * b1 / 10 + a * b2 / 100;

        long b0 = (b.charAt(0) - '0') * 100;
        long b1 = (b.charAt(2) - '0') * 10;
        long b2 = b.charAt(3) - '0';

        long ans = (a * b0 + a * b1 + a * b2) / 100;

        System.out.println(ans);
    }
}