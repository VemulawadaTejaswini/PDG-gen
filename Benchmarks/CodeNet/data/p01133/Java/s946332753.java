import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
    
public class Main_TLE {
        
    public static final int MAX = 20;
    public static final double INF = Double.MAX_VALUE;
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        double[][] dp = new double[1 << MAX][MAX];
        long[][] points = new long[MAX][2];
        double[][] adj = new double[MAX][MAX];
            
        while(true){
            final int n = sc.nextInt();
                
            if(n == 0){
                break;
            }
                
            final long h_x = sc.nextInt();
            final long h_y = sc.nextInt();
            final long g_x = sc.nextInt();
            final long g_y = sc.nextInt();
                
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 2; j++){
                    points[i][j] = sc.nextInt();
                }
            }
                
            final int size = n;
            final int limit = 1 << size;
                
            for(int i = 0; i < size; i++){
                for(int j = i + 1; j < size; j++){
                    long sum = 0;
                    for(int k = 0; k < 2; k++){
                        sum += (points[i][k] - points[j][k]) * (points[i][k] - points[j][k]);
                    }
                        
                    adj[i][j] = adj[j][i] = Math.sqrt(sum);
                    //System.out.println(adj[i][j]);
                }
            }
                
            for(int S = 0; S < limit; S++){
                for(int i = 0; i < size; i++){
                    dp[S][i] = INF;
                }
            }
            for(int i = 0; i < n; i++){
            	final double h_time = Math.sqrt(
                        (points[i][0] - h_x) * (points[i][0] - h_x) + 
                        (points[i][1] - h_y) * (points[i][1] - h_y));
            	
            	final double g_time = Math.sqrt(
                        (points[i][0] - g_x) * (points[i][0] - g_x) + 
                        (points[i][1] - g_y) * (points[i][1] - g_y));
                
                dp[1 << i][i] = h_time < g_time ? h_time : INF; 
            }
                
            for(int S = 0; S < limit; S++){
               LOOP: 
               for(int i = 0; i < size; i++){
                    if((S & (1 << i)) == 0){
                        continue;
                    }else if(dp[S][i] == INF){
                        continue;
                    }
                        
                    for(int j = 0; j < size; j++){
                        if((S & (1 << j)) != 0){
                            continue;
                        }
                           
                        final double time = Math.sqrt(
                                (points[j][0] - g_x) * (points[j][0] - g_x) + 
                                (points[j][1] - g_y) * (points[j][1] - g_y));
                        final double cost = dp[S][i] + adj[i][j];  
                            
                        if(time <= cost){
                           continue LOOP;
                        }
                    }
                       
                    for(int j = 0; j < size; j++){
                         if((S & (1 << j)) != 0){
                            continue;
                        }
                                
                        final double cost = dp[S][i] + adj[i][j];
                            
                        dp[S | (1 << j)][j] = Math.min(dp[S | (1 << j)][j], cost);
                    }
                }
            }
                
            double min = INF;
            for(int i = 0; i < size; i++){
                //System.out.print(dp[limit - 1][i] + " ");
                min = Math.min(min, dp[limit - 1][i]);
            }
                
            //System.out.println(min);
                
            System.out.println(min == INF ? "NO" : "YES");
        }
    }
    
}