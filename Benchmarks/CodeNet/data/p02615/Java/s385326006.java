import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        int lowValue = 1000000007;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ans += a;
            if (lowValue > a) {
                lowValue = a;
            }
        }
        ans -= lowValue;
        System.out.println(ans);
    }
}