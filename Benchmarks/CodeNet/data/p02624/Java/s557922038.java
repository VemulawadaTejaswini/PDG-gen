import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // a(n) = Sum_{k=1..n} k/2 * floor(n/k) * floor(1 + n/k)
        
        long ans = 0;
        for (long k = 1; k <= n; k++) {
            long now = (n / k) * (1 + (n / k)) * k / 2;
            ans += now;
        }
        System.out.println(ans);
    }
}