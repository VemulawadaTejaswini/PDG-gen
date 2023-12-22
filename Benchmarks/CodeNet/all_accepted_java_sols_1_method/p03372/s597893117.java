import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        
        long x[] = new long[N+1];
        int v[] = new int[N+1];
        
        for(int i = 1; i <= N; i++) {
            x[i] = sc.nextLong();
            v[i] = sc.nextInt();
        }
        
        long right[][] = new long[N+1][2];
        long rightMax[][] = new long[N+1][2];
        for(int i = 1; i <= N; i++) {
            right[i][0] = x[i];
            right[i][1] = right[i-1][1] + v[i] - ( right[i][0] - right[i-1][0] );
            
            rightMax[i][0] = Math.max( rightMax[i-1][0], right[i][1] );
            rightMax[i][1] = Math.max( rightMax[i-1][1], right[i][1] - right[i][0] );
        }
        
        long left[][] = new long[N+1][2];
        long leftMax[][] = new long[N+1][2];
        for(int i = 1; i <= N; i++) {
            left[i][0] = C - x[N-i+1];
            left[i][1] = left[i-1][1] + v[N-i+1] - ( left[i][0] - left[i-1][0] );
            
            leftMax[i][0] = Math.max( leftMax[i-1][0], left[i][1] );
            leftMax[i][1] = Math.max( leftMax[i-1][1], left[i][1] - left[i][0] );
        }
        
        long ans = 0;
        for(int i = 0; i <= N; i++) {
            ans = Math.max( ans, rightMax[i][0] + leftMax[N-i][1] );
            ans = Math.max( ans, rightMax[i][1] + leftMax[N-i][0] );
        }
        
        System.out.println( ans );
    }
}
