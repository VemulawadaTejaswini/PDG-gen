import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = Math.abs(scanner.nextLong());
        long k = scanner.nextLong();
        long d = scanner.nextLong();
        if (x >= k * d) {
            System.out.println(x - k * d);
            return;
        }
        long step = k - x / d;
        long r = x % d;
        if (step % 2 == 0) {
            System.out.println(r);
        } else {
            System.out.println(d - r);
        }


    }
}