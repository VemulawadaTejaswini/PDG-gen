import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w_limit = in.nextInt();
        int v[] = new int[n+1];
        int w[] = new int[n+1];
        int c[][] = new int[n+1][1005];
        
        for (int i = 1; i <= n; i++){
            v[i]=in.nextInt();
            w[i]=in.nextInt();
        }

        for (int i = 0; i<=w_limit; i++){
            c[0][i]=0;
        }
        
        for(int i = 1; i<=n; i++){
            c[i][0]=0;   
        }
        
         for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= w_limit; j++){
                c[i][j] = c[i-1][j];
                if (w[i] > j)continue;
                if (v[i] + c[i-1][j-w[i]] > c[i-1][j]){
                    c[i][j] = v[i] + c[i-1][j-w[i]];
                }
            }
        }    
        
        System.out.println(c[n][w_limit]);
    }  
}