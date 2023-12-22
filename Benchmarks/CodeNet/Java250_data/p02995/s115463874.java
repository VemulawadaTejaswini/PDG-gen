import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long ans = num(b, c, d) - num(a-1, c, d);
        System.out.println(ans);
        
    }

    public static long num(long n, long c, long d) {
        long G = gcd(c, d);
        long L = c / G * d;
        return n - n / c - n / d + n / L;
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}