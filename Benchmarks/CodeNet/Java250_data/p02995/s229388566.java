import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long g = gcd(c,d);
        long q = c * d / g;
        long r = b - a - (((b / c - (a - 1) / c) + b / d - (a - 1) / d) - b / q + (a - 1) / q) + 1;
        System.out.println(r);
    }
    public static long gcd(long a,long b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b,a % b);
    }
}