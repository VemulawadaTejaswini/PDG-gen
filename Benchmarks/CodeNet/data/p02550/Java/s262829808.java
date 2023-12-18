import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        long n = Long.parseLong(sc.next());
        int x = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        var a = new long[m+1];
        var set = new HashSet<Long>();
        a[0] = x;
        set.add(a[0]);
        int r = -1;
        for(int i = 1; i <= m; i++){
            a[i] = a[i-1] * a[i-1] % m;
            if(!set.add(a[i])){
                r = i;
                break;
            }
        }
        int l = -1;
        for(int i = 0; i < m; i++){
            if(a[i] == a[r]){
                l = i;
                break;
            }
        }
        
        long ans = 0;
        long b = Math.min(n, l);
        for(int i = 0; i < b; i++){
            ans += a[i];
        }
        long n2 = n - l;
        long c = n2 / (r-l);
        for(int i = l; i < r; i++){
            ans += a[i] * c;
        }
        long d = l + (n2 % (r-l));
        for(int i = l; i < d; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}