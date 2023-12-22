import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        
        long ans = 0;
        int r = 0;
        long sum = 0;
        for( int l = 0; l < N; l++ ) {
            while( r < N && (sum + A[r]) == (sum ^ A[r]) ) {
                sum += A[r];
                r++;
            }
            
            ans += r - l;
            sum -= A[l];
        }
        
        System.out.println( ans );
    }
}
