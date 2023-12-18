import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long min = Math.min(Math.min(Math.min(Math.min(d, e), c), b), a);
        if (n % min == 0) {
            System.out.println(n / min + 4);
        } else {
            System.out.println(n / min + 5);
        }
    }
}
