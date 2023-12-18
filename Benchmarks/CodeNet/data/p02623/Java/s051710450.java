import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        for(int i=0; i<n; i++){
            a[i+1] = Long.parseLong(sc.next());
        }
        for(int i=0; i<a.length-1; i++){
            a[i+1] += a[i];
        }
        for(int i=0; i<m; i++){
            b[i+1] = Long.parseLong(sc.next());
        }
        for(int i=0; i<b.length-1; i++){
            b[i+1] += b[i];
            //System.out.println(b[i+1]);
        }
        
        int max = 0;
        for(int i=0; i<a.length; i++){
            int ub = m+1;
            int lb = 0;
            long l = k - a[i];
            //System.out.println(a[i]);
            if(l<0){
                break;
            }
            for(int j=0; j<100; j++){
                int mid = (ub+lb)/2;
                if(b[mid]<=l){
                    lb = mid;
                }else{
                    ub = mid;
                }
            }
            int tmp = i+lb;
            //System.out.println(lb);
            //System.out.println("  "  + i);
            //System.out.println("  "  + l);
            //System.out.println("  "  + b[lb]);
            max = Math.max(max, tmp);
        }
        
        System.out.println(max);
        
    }
    
}
