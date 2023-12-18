import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        long K = Long.parseLong(input[2]);

        while(K > 0){
          if(A >= 1){
            if(K >= A){
              K = K - A;
              A = 0;
            }else{
              A = A - K;
              break;
            }
          }else if(B >= 1){
            if(K >= B){
              K = K - B;
              B = 0;
            }else{
              B = B - K;
              break;
            }
          }else{
            break;
          }
        }

        System.out.println(A + " " + B);
      }
    }
}