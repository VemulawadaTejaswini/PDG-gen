import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = N;
        for(int i = 0; i <= N; i++ ) {
            int cc = 0;
            int x6 = i;
            while( x6 > 0 ) {
                cc += x6 % 6;
                x6 /= 6;
            }
            
            int x9 = N - i;
            while( x9 > 0 ) {
                cc += x9 % 9;
                x9 /= 9;
            }
            ans = Math.min(ans, cc);
        }
        
        System.out.println( ans );
        
    }
}
