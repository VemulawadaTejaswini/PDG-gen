import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long lcm = lcm(c,d);
        long ac = (a-1)/c;
        long bc = b/c;
        long ad = (a-1)/d;
        long bd = b/d;
        long al = (a-1)/lcm;
        long bl = b/lcm;
        System.out.println(b - (a-1) - (bc + bd - bl - (ac + ad - al)));
        sc.close();

    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
