import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Long[] a = new Long[N];
        long t = 0;
        for(int i=0; i < N; i++){
            a[i] = Long.parseLong(sc.next());
            t+=a[i];
        }
        
        // Arrays.sort(a);
        long inf = 2147000009;
        
        long x = 0;
        long y = t;
        long min = inf;
        
        for(int i=0; i < N; i++){
            
            x += a[i];
            y -= a[i]; 
            
            if(i<N-1)min = Math.min( min, Math.abs(x-y)  );
           
           
        }

  

        System.out.print( min );

        System.out.println();
    }

}