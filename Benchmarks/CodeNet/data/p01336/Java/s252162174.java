
import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        
        while( sc.hasNext() ){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] p = new int[301][4];
            for(int i=0; i<N;i++){
                sc.nextLine(); sc.nextLine();
                for(int j=0; j<4; j++){   
                    p[i][j] = sc.nextInt();
                }
            }

            
            int[][] dp = new int[M+1][4];
                for(int i=0; i<N; i++){
                    for(int j=1; j<4;j++){
                        for(int k=0; k<=M; k++){
                            if(k+p[i][0] <= M) dp[ k+p[i][0] ][j] = Math.max(dp[ k+p[i][0] ][j], p[i][j] + dp[k][j]);
                        }
                    }
                }

                int max = 0;
                for(int[] d: dp) for(int s: d) max = Math.max(s, max);
                
                System.out.println(max);
        }
        
    }
}

	    
	    