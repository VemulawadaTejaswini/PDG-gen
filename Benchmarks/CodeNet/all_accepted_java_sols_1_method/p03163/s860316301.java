import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main{

    static long[][] dp = new long[101][100001];

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int w = sc.nextInt();
        int v = sc.nextInt();
    
        for(int j = 0; j <= W; j++){
            if(w <= j) dp[1][j] = v;
            else dp[1][j] = 0;
        }        

        for(int i = 2; i <= N; i++){
            w = sc.nextInt();
            v = sc.nextInt();
            for(int j = 0; j <= W; j++){
                //slucaj da ne uzememo i-ti po redu
                dp[i][j] = dp[i-1][j];
                //ako zelimo uzeti i-ti po redu                
                if(w <= j && dp[i][j] < (dp[i-1][j-w] + v) )
                    dp[i][j] = v+ dp[i-1][j-w]; 
            }    
        }            

        System.out.println( dp[N][W] );    
    }
}
