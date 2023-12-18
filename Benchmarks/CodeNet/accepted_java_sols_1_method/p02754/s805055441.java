import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();

        if (b == 0) {
            System.out.println(0);
        } else if (r == 0) {
            System.out.println(n);
        } else {
            long times = n / (b + r);
            long rev = n % (b + r);
            System.out.println(times * b + Math.min(rev, b));
        }
    }
}