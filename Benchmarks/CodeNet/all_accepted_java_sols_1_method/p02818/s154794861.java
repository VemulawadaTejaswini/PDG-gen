import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long remain = k - a;
        if (remain == 0) {
            System.out.printf("%s %s", 0, b);
            System.exit(0);
        } else if (remain < 0) {
            System.out.printf("%s %s", a - k, b);
            System.exit(0);
        }

        long aoki = b - remain;
        if (aoki <= 0) {
            System.out.printf("%s %s", 0, 0);
        } else {
            System.out.printf("%s %s", 0, aoki);
        }
    }
}
