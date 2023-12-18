import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] sum = new long[n+1];
        long mod = 1000000007;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum[i+1] = sum[i] + a[i];
            sum[i+1] %= mod;
        }
        long res = 0;
        for(int i=1; i<n; i++) {
            res += a[i] * sum[i];
            res %= mod;
        }
        System.out.println(res);

    }


}