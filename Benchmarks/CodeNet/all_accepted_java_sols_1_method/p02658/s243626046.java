import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long lastAns = 1;
        boolean over = false;
        for (int i = 0; i < n; i++) {
            long v = sc.nextLong();
            if (v == 0) {
                System.out.println(0);
                return;
            }
            ans *= v;
            if (lastAns > ans || ans > 1000000000000000000L) {
                over = true;
            }
            lastAns = ans;
        }
        System.out.println(over ? -1 : ans);
    }
}