import java.util.*;
 
public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long num = 1;
        long ans = 0;
        
        if (n - m == 1) {
            for (long i = 1; i <= m; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * num) % 1000000007;
            ans = (ans * n) % 1000000007;
        } else if (n - m == -1) {
            for (long i = 1; i <= n; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * num) % 1000000007;
            ans = (ans * m) % 1000000007;
        } else if (n - m == 0) {
            for (long i = 1; i <= n; i++) {
                num = (num * i) % 1000000007;
            }
            ans = (num * num) % 1000000007;
            ans = (ans * 2) % 1000000007;
        }
        System.out.println(ans);
    }
}
