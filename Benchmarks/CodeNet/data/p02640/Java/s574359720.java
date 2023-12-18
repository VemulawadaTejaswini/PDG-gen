import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] str = br.readLine().split(" ");
          int X = Integer.parseInt(str[0]);
          int Y = Integer.parseInt(str[1]);

          boolean flag = false;
          int[][] table  = new int[101][101];
          
          for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
              table[i][j] = i*2 + j*4;
            }
          }

          Loop:for(int i = 0; i <= X; i++){
            for(int j = 0; j <= X; j++){
              if(table[i][j] == Y){
                flag = true;
                break Loop;
              }
            }
          }

          if(flag){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }

    }
}