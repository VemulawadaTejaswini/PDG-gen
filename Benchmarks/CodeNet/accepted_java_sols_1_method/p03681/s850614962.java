import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int devider = 1000000007;
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        long count = 1;
        if (n == m) {
            while(n != 1) {
                count *= n;
                count %= devider;
                count *= m;
                count %= devider;
                n--;
                m--;
            }
            count *= 2;
            count %= devider;
        } else {
            int large = Math.max(n, m);
            int small = Math.min(n, m);
            while(large != 1) {
                count *= large;
                count %= devider;
                count *= small;
                count %= devider;
                large--;
                small--;
            }
        }
        System.out.println(count);
    }
}