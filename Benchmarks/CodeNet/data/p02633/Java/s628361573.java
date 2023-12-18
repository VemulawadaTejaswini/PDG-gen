import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if (360 % x == 0) {
            System.out.println(360 / x);
        } else {
            long lcm = lcm(x, 360);
            System.out.println(lcm);
        }
    }

    private static long gcd(long a, long b) {
        long r;
        while( (r = a % b) != 0 ) {
            a = b;
            b = r;
        }
        return b;
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a,b);
    }
}
