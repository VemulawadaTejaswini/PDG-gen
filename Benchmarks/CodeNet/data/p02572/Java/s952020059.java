import java.util.*;

public class Main{
    final int INF = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        long[] b = new long[n];
        long out = 0;
        for(int i = 0; i < n; i++){
            b[i] = sum;
            sum -= a[i];
            out += a[i] * (b[i] - a[i]);
            if(out > INF) out %= INF;
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
