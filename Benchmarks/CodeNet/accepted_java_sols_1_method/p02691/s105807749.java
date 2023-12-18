import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int[] a = new int[n];
        int[] b = new int[n];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long ans = 0;
        for(int i=0; i<n; i++){
            b[i] = a[i] + i;
            h.put(b[i], h.getOrDefault(b[i], 0)+1);
            ans += h.getOrDefault(i-a[i], 0);
        }
        
        System.out.println(ans);
        
    }
}
