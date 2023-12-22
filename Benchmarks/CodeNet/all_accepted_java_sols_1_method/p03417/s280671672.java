import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long ans = 0;
        if( N > 2 && M > 2 ) {
            ans = (M-2) * (N-2);
        } else if( N == 2 || M == 2 ) {
            ans = 0;
        } else if( N == 1 || M == 1 ) {
            if( N == 1 && M == 1 ) {
                ans = 1;
            } else if( N == 1 ) {
                ans = M - 2;
            } else {
                ans = N - 2;
            }
        }
        
        System.out.println(ans);
    }
}
