import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int num = Integer.parseInt(br.readLine());
        String[] cypher = br.readLine().split("");

        //for algorithm
        boolean[][][] dp = new boolean[num+1][4][1000];
        int count = 0;

        dp[0][0][0] = true;

        // dynamic programming
        for(int i = 0; i < num; i++){
          for(int j = 0; j <= 3; j++){
            for(int t = 0; t < 1000; t++){
              if(dp[i][j][t]){
                dp[i+1][j][t] = true;

                if(j <= 2){
                  dp[i + 1][j + 1][t*10 + (Integer.parseInt(cypher[i]))] = true;
                }
              }else{
                continue;
              }

            }

          }
        }
        
        for(int i = 0; i < 1000; i++){
          if(dp[num][3][i]){
            count++;
          }
        }
        
        System.out.println(count);

      }
    }
}