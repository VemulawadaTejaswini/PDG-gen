import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        long z = (long)1e18;
        
        Arrays.sort(a);
        long ans = 1;
        for(int i=0; i<n; i++){
            if(a[i]==0){
                System.out.println(0);
                return;
            }
            if(z/a[i]<ans){
                System.out.println(-1);
                return;
            }
            ans *= a[i];
        }
        
        
        System.out.println(ans);
    }
}