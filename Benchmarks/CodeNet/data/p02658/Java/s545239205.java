import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          int N = Integer.parseInt(br.readLine());
          String[] num_s = br.readLine().split(" ");
          long[] num = new long[N];
          
          for(int i = 0; i < N; i++){
            num[i] = Long.parseLong(num_s[i]);
          }

          long result = 0;

          for(int i = 0; i < N; i++){
            if(i == 0){
              result = (long)num[i];
            }else{
              result = result * num[i];
            }
          }

          if(result > (long)Math.pow(10, 18)){
            System.out.println("-1");
          }else{
            System.out.println(result);
          }
        }
    }
}