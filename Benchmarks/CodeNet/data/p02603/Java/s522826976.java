import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Integer first = null;
        for (int i = 0; i < n-1; i++) {
            if (a[i] < a[i+1]) {
                first = i;
                break;
            }
        }
        if (first == null) {
            System.out.println("1000");
            return;
        }

        long kabu =  0;
        long money =  1000;
        for (int i = first; i < n-1; i++) {
            long cur = a[i];
            long next = a[i+1];
            if (cur < next) {
                // buy
                kabu += money / cur;
                money -= cur * kabu;
            } else {
                //sell
                money += kabu * cur;
                kabu = 0;
            }
        }
        money += kabu * a[n-1];
        System.out.println(money);
    }
}
