import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");
          int result = 0;

          for(int i = 0; i < input.length; i++){
            if(input[i].equals("0")){
              result = i + 1;
            }
          }

          System.out.println(result);
        }

    }
}