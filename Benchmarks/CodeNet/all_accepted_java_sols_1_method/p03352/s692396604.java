import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int rX = (int)Math.sqrt((double)X);       
        
        int ans = 0;
        for(int i = 1; i <= rX; i++) {
            for(int j = 1; j <= 10; j++ ) {
                int a = (int)Math.pow( i, j );
                if( a > X ) {
                    continue;
                }
                ans = Math.max( ans, a );
            }
        }
        
        System.out.println(ans);
    }
}
