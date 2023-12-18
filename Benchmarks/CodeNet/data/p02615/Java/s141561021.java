import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long min = 99999999999999L;
        for (int i=1;i<=n;i++) {
            long a = sc.nextLong();
            ans += a;
            if (min > a) {
                min = a;
            }
        }
        ans -= min;
        System.out.println(ans);
    }
}
