import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        int x = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        var a = new long[m+1];
        a[1] = x;
        var set = new HashSet<Long>();
        set.add(a[1]);
        int c = -1;
        for(int i = 2; i <= m; i++){
            a[i] = a[i-1] * a[i-1] % m;
            if(c == -1 && !set.add(a[i])){
                c = i;
            }
        }
        int d = -1;
        for(int i = 1; i <= m; i++){
            if(a[i] == a[c]){
                d = i;
                break;
            }
        }
        
        long ans = 0;
        int e = (int)Math.min(n, d-1);
        for(int i = 1; i <= e; i++){
            ans += a[i];
        }
        long f = n - e;
        long g = f/(d-c);
        for(int i = d; i < c; i++){
            ans += a[i] * f;
        }
        int h = (int)(f % (d-c));
        for(int i = d; i <= h; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}