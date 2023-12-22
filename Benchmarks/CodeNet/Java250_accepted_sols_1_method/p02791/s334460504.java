import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        // input
        int N = Integer.parseInt(br.readLine());
        String[] permutation = br.readLine().split(" ");

        // algorithm
        int min = 0;
        int result = 0;
        int tmp = 0;

        for(int i = 0; i < N; i++){
          tmp = Integer.parseInt(permutation[i]);
          
          if(i == 0){
            min = tmp;
            result++;
          }else{
            if(min >= tmp){
              result++;
              min = tmp;
            }else{
              continue;  
            }
          }

        }

        System.out.println(result);
      }
    }
}