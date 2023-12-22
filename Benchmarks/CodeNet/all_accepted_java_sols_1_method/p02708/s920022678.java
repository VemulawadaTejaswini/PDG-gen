import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        long start = 0;
        for (int i = 1; i < k; i++) {
            start += i;
        }
        long end = 0;
        for (int i = n; i > n - k; i--) {
            end += i;
        }
        for (int i = k; i <= n + 1; i++) {
            if (i > k) {
                start += i - 1;
                end += n + 1 - i;
            }
            ans += end - start + 1;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}