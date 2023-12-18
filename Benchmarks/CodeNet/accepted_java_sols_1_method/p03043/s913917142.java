import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            int count = 0;
            while (true) {
                if (x < k) {
                    x = x << 1;
                    count++;
                } else {
                    break;
                }
            }
            ans += Math.pow(0.5, count) / n;
        }
        System.out.println(ans);
    }
}
