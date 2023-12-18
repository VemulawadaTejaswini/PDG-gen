import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        HashMap<Integer, Integer> ha = new HashMap<>();
        HashMap<Integer, Integer> hb = new HashMap<>();
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            ha.put(a[i], ha.getOrDefault(a[i], 0)+1);
        }
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(sc.next());
            hb.put(b[i], hb.getOrDefault(b[i], 0)+1);
        }
        
        Set<Integer> hbs = hb.keySet();
        for(int k : hbs){
            int tmpa = ha.getOrDefault(k, 0);
            int tmpb = hb.getOrDefault(k, 0);
            if(tmpa + tmpb > n){
                System.out.println("No");
                return;
            }
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            q.addLast(b[n-i-1]);
        }
        
        System.out.println("Yes");
        for(int i=0; i<n; i++){
            int now = q.pollFirst();
            while(a[i] == now){
                q.addLast(now);
                now = q.pollFirst();
            }
            System.out.print(now);
            if(i!=n-1){
                System.out.print(" ");
            }
        }
        
    }
    
}