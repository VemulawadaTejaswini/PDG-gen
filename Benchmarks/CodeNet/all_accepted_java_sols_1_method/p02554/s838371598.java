import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        final long MOD = 1000000007;
        
        long a = 1;
        long b = 1;
        long c = 1;
        for(int i = 0; i < n; i++){
            a *= 10;
            a %= MOD;
            b *= 9;
            b %= MOD;
            c *= 8;
            c %= MOD;
        }
        long ans = a - b*2 + c;
        ans %= MOD;
        if(ans < 0) ans += MOD;
        System.out.println(ans);
    }
}