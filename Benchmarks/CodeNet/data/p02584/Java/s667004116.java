import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long k = scan.nextLong();
        long d = scan.nextLong();
        long num = Math.abs(x) / d;
        if (k <= num) {
            if (x > 0) x -= k * d;
            else x += k * d;
            System.out.println(x);
            return;
        }
        x = x % d;
        k -= num;
        if (x > 0 && k > 0) {
            x -= d;
            k--;
        }
        long tmp = k % 2 == 1 ? x + d : x;
        long ans = Math.abs(tmp);
        System.out.println(ans);
    }
}
