import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = 1L;
        if(Math.abs(n - m) <= 1){
            for(int i = 1; i <= n; i++) ans = ans * i % MOD;
            for(int i = 1; i <= m; i++) ans = ans * i % MOD;
            if(n == m) ans = ans * 2 % MOD;
        }else{
            ans = 0;
        }

        System.out.println(ans);
        sc.close();
    }

}
