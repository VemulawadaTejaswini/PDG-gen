import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int A[] = new int[20];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        Boolean dp[][] = new Boolean[21][2001];
        for(int i = 0; i < 21; i++)for(int j = 0; j <= 2000; j++)dp[i][j] = false;
        dp[0][0] = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= 2000; j++){
                if(dp[i][j]){
                    dp[i + 1][j] = true;
                    if(j + A[i] <= 2000){
                        dp[i + 1][j + A[i]] = true;
                    }
                }
            }
        }

        int q = sc.nextInt();
        for(; q > 0; q--){
            int m = sc.nextInt();
            if(dp[n][m])System.out.println("yes");
            else System.out.println("no");
        }

    }
  
}
