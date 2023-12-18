import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          int N = Integer.parseInt(br.readLine());
          String[] num_s = br.readLine().split(" ");
          Long[] num = new Long[N];
          boolean z_flag = false;
          boolean flag = false;

          for(int i = 0; i < N; i++){
            num[i] = Long.parseLong(num_s[i]);
            if(num[i] == 0){
              z_flag = true;
            }
          }

          Long result = 0L;
          Long cmp = 1000000000000000000L;

          for(int i = 0; i < N; i++){
            if(i == 0){
              result = num[i];
            }else{
              result = result * num[i];
            }

            if(result > cmp){
              flag = true;
              break;
            }
          }

          if(flag){
            if(z_flag){
              System.out.println("0");
            }else{
              System.out.println("-1");
            }
          }else{
            System.out.println(result);
          }
        }
    }
}