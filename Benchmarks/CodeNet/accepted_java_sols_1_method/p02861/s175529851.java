import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        int n = Integer.parseInt(br.readLine());
        int[][] point = new int[n][2];
        double[][] dis = new double[n][n];

        //init
        for(int i = 0; i < n; i++){
          Arrays.fill(dis[i], -1);
        }

        // for algorithm
        double tmp = 0.0;
        double result = 0.0;
        int count = 0;
        double div = (double)2/n;

        for(int i = 0; i < n; i++){
          String[] str = br.readLine().split(" ");
          point[i][0] = Integer.parseInt(str[0]);
          point[i][1] = Integer.parseInt(str[1]);
        }

        for(int i = 0; i < n; i++){
          for(int j = i + 1; j < n; j++){
            tmp = Math.pow((double)(point[i][0]-point[j][0]), 2.0) + Math.pow((double)(point[i][1]-point[j][1]), 2.0);
            dis[i][j] = Math.sqrt(tmp);
          }
        }

        // algorithm
        for(int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
            if(dis[i][j] == -1.0){
              continue;
            }else{
               result += dis[i][j];
               count++;
            }
          }
        }
        
        System.out.println(result * div);
        
      }
    }
}