import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String input = br.readLine();
        int result = 0;

        if(input.contains("A")){
          result++;
        }

        if(input.contains("B")){
          result++;
        }

        if(result == 2){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}