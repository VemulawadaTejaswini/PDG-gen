import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          int N = Integer.parseInt(br.readLine());
          String[] num_s = br.readLine().split(" ");
          long[] num = new long[N];
          boolean z_flag = false;
          boolean flag = false;

          for(int i = 0; i < N; i++){
            num[i] = Long.parseLong(num_s[i]);
            if(num[i] == 0){
              z_flag = true;
            }
          }

          long result = 1;
          long cmp = 1000000000000000000L;

          for(int i = 0; i < N; i++){
            result *= num[i];
            if(result > cmp){
              flag = true;
              break;
            }else if(result < 1){
              flag = true;
              break;
            }
            //System.out.println(result);
          }

          if(flag){
            if(z_flag){
              System.out.println("0");
            }else{
              System.out.println("-1");
            }
          }else{
            //System.out.println(Long.MAX_VALUE);
            System.out.println(result);
          }
        }
    }
}