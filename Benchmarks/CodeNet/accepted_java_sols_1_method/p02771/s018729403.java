import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");
        
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int result = 0;

        if(A == B){
          result += 1;
        }

        if(A == C){
          result += 1;
        }
        
        if(B == C){
          result += 1;
        }

        if(result == 1){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}