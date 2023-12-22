import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();
        long gap = Math.min((r - l), 2018);
        l %= 2019;
        r %= 2019;
        
        long ans = 2019;

        if (r <= l) {
            ans = 0;
        } else {
            for (long i = l; i < l + gap; i++) {
                for (long j = i + 1; j <= l + gap; j++) {
                    long value = i * j % 2019;
                    ans = Math.min(ans, value);
                    if (ans == 0) {
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}