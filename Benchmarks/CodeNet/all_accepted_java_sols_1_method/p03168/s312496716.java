import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{

    static double[][] dp = new double[3001][1502];
    static double[] mData = new double[3001];    
    static int N;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        N = sc.nextInt();
        for(int i = 0; i < N; i++){
            mData[i+1] = sc.nextDouble();
        }
        
        int Npola = N/2 + 1;

        dp[1][0] = 1;
        dp[1][1] = mData[1];
        for(int i = 2; i < Npola; i++){
            dp[1][i] = 0;
        }

        for(int i = 2; i <= N; i++){
            dp[i][0] = 1;            
            for(int j = 1; j < 1502; j++){
                dp[i][j] = ( mData[i]*dp[i-1][j-1] + (1-mData[i])*dp[i-1][j] ); 
                //System.out.println( dp[i][j] );
            }
        }
    /*
        for(int i = 1; i <= N; i++){
            for(int j = 0; j <= N; j++){
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
    */
        System.out.println( dp[N][N/2 + 1] );
        sc.close();
    }
}















