import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        long mod = x % d;
        long count = x / d;
        if(count >= k) {
            System.out.println(x - (k * d));
            return;
        }

        if(count % 2 == k % 2) {
            System.out.println(mod);
        } else {
            System.out.println(Math.min(Math.abs(mod - d), mod + d));
        }
    }
}