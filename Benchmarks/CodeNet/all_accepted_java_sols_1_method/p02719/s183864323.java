import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();


        if (n % k == 0) {
            System.out.println(0);
        } else {
            long a = n % k;
            long b = a - k;


            if (b < 0) {
                b = -b;
            }

            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}