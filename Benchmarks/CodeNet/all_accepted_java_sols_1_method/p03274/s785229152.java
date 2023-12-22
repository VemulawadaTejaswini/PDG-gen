import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        
        long ans = Long.MAX_VALUE;
        for(int l = 0; l < N; l++){
            int r = l+K-1;
            if( r >= N ) break;
            if( l-1 >= 0 && x[l-1] > 0 ) break;
            if( r+1 < N && x[r+1] < 0 ) continue;
            
            long kyori = Long.MAX_VALUE;
            if( x[l] <= 0 && x[r] >= 0 ){
                kyori = Math.min(Math.abs(x[l]*2)+x[r], Math.abs(x[l])+x[r]*2);
            } else {
                kyori = Math.max(Math.abs(x[l]), Math.abs(x[r]));
            }
            
            ans = Math.min(ans, kyori);
        }
        
        System.out.println(ans);
    }
}
