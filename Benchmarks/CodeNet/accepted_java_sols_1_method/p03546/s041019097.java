import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      StringTokenizer str = new StringTokenizer(sc.nextLine());
      int h = Integer.parseInt(str.nextToken());
      int w = Integer.parseInt(str.nextToken());
      
      int[][] cost = new int[10][10];
      for(int i = 0; i < cost.length; i++){
         str = new StringTokenizer(sc.nextLine());
         for(int j = 0; j < cost[i].length; j++){
            cost[i][j] = Integer.parseInt(str.nextToken());
         }
      }
      
      for(int i = 0; i < cost.length; i++){
         for(int j = 0; j < cost.length; j++){
            for(int k = 0; k < cost.length; k++){
               cost[j][k] = Math.min(cost[j][k], cost[j][i] + cost[i][k]);
            }
         }
      }
      
      long ans = 0;
      for(int i = 0; i < h; i++){
         str = new StringTokenizer(sc.nextLine());
         for(int j = 0; j < w; j++){
            int n = Integer.parseInt(str.nextToken());
            if(n != -1) {
               ans += cost[n][1];
            }
         }
      }
      System.out.println(ans);             
   }
}