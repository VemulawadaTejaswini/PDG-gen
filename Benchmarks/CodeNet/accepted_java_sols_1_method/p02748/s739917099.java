import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] reizouko = new int[a];
        int[] densirenji = new int[b];
        
        for(int i=0; i<a; i++){
            reizouko[i] = Integer.parseInt(sc.next());
        }
        
        for(int i=0; i<b; i++){
            densirenji[i] = Integer.parseInt(sc.next());
        }
        
        int ans = (int)1e9;
        
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            int c = Integer.parseInt(sc.next());
            ans = Math.min(ans, reizouko[x] + densirenji[y] - c);
        }
        
        Arrays.sort(reizouko);
        Arrays.sort(densirenji);
        
        ans = Math.min(ans, reizouko[0]+densirenji[0]);
        
        System.out.println(ans);
    }
    
}
