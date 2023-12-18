import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        long ans = 0;
        long x = 0;
        final long MOD = 1000000007;
        for(int i = 1; i < n; i++){
            x += a[i-1];
            x %= MOD;
            ans += a[i] * x;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}