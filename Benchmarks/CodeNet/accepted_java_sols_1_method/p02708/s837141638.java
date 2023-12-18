import java.util.Scanner;

public class Main {
    
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        long ans = 1;
        long a = 0;
        long b = 0;
        for(int i = 0; i < k; i++){
            a += n-i;
            b += i;
        }
        for(int i = k; i <= n; i++){
            ans += a-b+1;
            ans %= MOD;
            a += n-i;
            b += i;
        }
        System.out.println(ans);
    }
}