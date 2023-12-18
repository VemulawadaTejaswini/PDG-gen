import java.util.*;

public class Main{
    final long MOD = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <= 2){
            System.out.println(0);
            return;
        }
        long x = 2;
        long out = 1;
        while(n / x >= 3){
            if(n % x != 0){
                out += (n / x - 3 + n % x) * x * (x - 1);
            }else{
                out += (n / x - 3) * x + 1;
            }
            x++;
            if(out > MOD) out %= MOD;
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
