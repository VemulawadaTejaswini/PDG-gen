import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        long[] b = new long[n];
        long sum = 0;
        for(int i=n-1; i>=0; i--){
            sum += a[i];
            sum %= MOD;
            b[i] = sum;
        }
        
        long ans = 0;
        for(int i=0; i<n-1; i++){
            ans += a[i]*b[i+1]%MOD;
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
}
