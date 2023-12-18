import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            int C = Integer.parseInt(str[2]);
            int K = Integer.parseInt(str[3]);

            int result = 0;

           for(int i = 0; i < 3; i++){
             if(A != 0){
              if(A > K){
                result += K;
                break;
              }else{
                result += A;
                K = K - A;
                A = 0;
                if(K == 0){
                   break; 
                }
              }
             }else if(B != 0){
               if(B > K){
                 break;
               }else{
                 K = K - B;
                 B = 0;
                 if(K == 0){
                   break;
                 }
               }
             }else if(C != 0){
               if(C > K){
                 result -= K;
                 break;
               }else{
                 result -= C;
                 K = K -C;
                 C = 0;
                 if(K ==0){
                   break;
                 }
               }
             }
           }

            System.out.println(result);
        }

    }
}