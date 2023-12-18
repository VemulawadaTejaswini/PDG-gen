import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        a[0] = 0;
        for(int i=1; i<=n; i++) {
            a[i] = a[i-1] + Long.parseLong(sc.next());
        }
        b[0] = 0;
        for(int i=1; i<=m; i++) {
            b[i] = b[i-1] + Long.parseLong(sc.next());
        }
        
        int maxb = m;
        long ans = 0;
        for(int i=0; i<=n; i++) {
            for(int j=maxb; j>=0; j--) {
                if(a[i]+b[j] <= k) {
                    if(ans < i+j) ans = i+j;
                    maxb = j;
                    break;
                }
            }
        }
        
        System.out.println(ans);
        
    }
}