import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] num = new int[N];

        for(int i = 0; i < N; i++){
          num[i] = Integer.parseInt(array[i]);
        }
        
        int result = 0;
        int flag = 0;

        for(int i = 0; i < N; i++){
          if((num[i] % 2) == 0){
            if((num[i] % 3) == 0 || (num[i] % 5) == 0){
              result += 1;
            }else{
              flag += 1;
            }
          }else{
            continue;
          }
        }
    
        if(flag ==  0){
          System.out.println("APPROVED");
        }else{
          System.out.println("DENIED");
        }

      }
    }
}