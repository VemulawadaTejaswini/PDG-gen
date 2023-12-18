import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input_n_m = br.readLine().split(" ");

        int N = Integer.parseInt(input_n_m[0]);
        int M = Integer.parseInt(input_n_m[1]);

        int[] height = new int[N];
        int[] result = new int[N];
        Arrays.fill(height, 0);
        Arrays.fill(result, 0);
        String[] input_h = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
          height[i] = Integer.parseInt(input_h[i]);
        }

        int count = 0;
        int A, B = 0;

        for(int i = 0; i < M; i++){
          String[] tmp = br.readLine().split(" ");
          A = Integer.parseInt(tmp[0]);
          B = Integer.parseInt(tmp[1]);

          if(result[A-1] == 0){
            result[A-1] = height[B-1];
          }else{
            if(result[A-1] < height[B-1]){
              result[A-1] = height[B-1];
            }
          }

          if(result[B-1] == 0){
            result[B-1] = height[A-1];
          }else{
            if(result[B-1] < height[A-1]){
              result[B-1] = height[A-1];
            }
          }
        }

        for(int i = 0; i < N; i++){
          if(result[i] < height[i]){
            count++;
          }
        }
        
        System.out.println(count);
      }
    }
}