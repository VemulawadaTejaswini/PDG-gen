import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long range = b - a + 1;
        long cMultiple = Math.floorDiv(b, c) - Math.floorDiv(a - 1, c);
        long dMultiple = Math.floorDiv(b, d) - Math.floorDiv(a - 1, d);

        long chohuku = lcm(c , d);

        long cdMultiple = Math.floorDiv(b, chohuku) - Math.floorDiv(a - 1, chohuku);

        System.out.println(range - (cMultiple + dMultiple - cdMultiple));
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}