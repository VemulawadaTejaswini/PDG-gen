import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(a);
        int l = 0;
        int r = n-1;
        long ans = k%2==0 ? 1 : a[r--];
        int b = ans<=0 ? -1 : 1;
        while(k>1){
            long m = a[l]*a[l+1];
            long p = a[r]*a[r-1];
            if(m*b >= p*b){
                ans = ans*(m%MOD)%MOD;
                l+=2;
            }else{
                ans = ans*(p%MOD)%MOD;
                r-=2;
            }
            k-=2;
        }
        System.out.println((ans+MOD)%MOD);
    }
}
