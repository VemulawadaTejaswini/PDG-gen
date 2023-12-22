import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        long ans = n;
        long b = n;

        if (b % k != 0) {
            b = b % k;
            while (true) {
                b = Math.abs(b - k);
                if (ans > b) {
                    ans = b;
                } else {
                    break;
                }
            }
        } else {
            ans = 0;
        }
        System.out.println(ans);
    }
}
