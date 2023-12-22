import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inf = (int)1e9;
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long ans = 0;
        int bit = 0;
        int val = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            q.addLast(a[i]);
            bit ^= a[i];
            val += a[i];
            while(bit != val){
                int b = q.pollFirst();
                bit ^= b;
                val -= b;
            }
            //System.out.println("___" + q.size());
            ans += q.size();
        }
        
        System.out.println(ans);
    }
}