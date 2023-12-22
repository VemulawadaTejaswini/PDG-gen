import java.util.*;
 
public class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for(int i = k; i <= n + 1; i++){
            ans = (ans + ((long)(n + 1 - i) * (long)(i)) + 1) % mod;
        }
        System.out.println(ans);
    }
}