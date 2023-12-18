import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int mlen = 0;
        int plen = 0;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            if(a[i] < 0){
                mlen++;
            }else{
                plen++;
            }
        }
        
        Arrays.sort(a);
        
        long ans = 1;
        if(plen == 0){
            if(k%2==1){
                for(int i=0; i<k-1; i+=2){
                    long tmp = a[n-1-i];
                    tmp *= a[n-2-i];
                    tmp %= MOD;
                    ans *= tmp;
                    ans %= MOD;
                }
                ans *= a[n-k];
                ans %= MOD;
            }else{
                for(int i=0; i<k; i+=2){
                    long tmp = a[i];
                    tmp *= a[i+1];
                    tmp %= MOD;
                    ans *= tmp;
                    ans %= MOD;
                }
            }
        }else{
            int l = 0;
            int r = n-1;
            if(k%2==1){
                ans *= a[r];
                ans %= MOD;
                r--;
                k--;
            }
            while(k>0){
                long m = a[l];
                m *= a[l+1];
                long p = a[r];
                p *= a[r-1];
                if(m >= p){
                    ans *= m%MOD;
                    ans %= MOD;
                    l+=2;
                }else{
                    ans *= p%MOD;
                    ans %= MOD;
                    r-=2;
                }
                k-=2;
            }
        }
        
        System.out.println((ans+MOD)%MOD);
        
    }
    
}
