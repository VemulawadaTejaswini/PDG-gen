import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int array[][] = new int[2+1][N+1];
        for(int i = 1; i < 2+1; i++){
            for( int j = 1; j < N+1; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        int dp[][] = new int[2+1][N+1];
        
        for( int i = 1; i < 2+1; i++ ){
            for( int j = 1; j < N+1; j++ ) {
                dp[i][j] = array[i][j] + Math.max( dp[i][j-1], dp[i-1][j] );
            }
        }
        
        System.out.println( dp[2][N] );
        
    }
}
