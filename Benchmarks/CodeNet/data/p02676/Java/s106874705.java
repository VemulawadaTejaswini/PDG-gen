import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int K = Integer.parseInt(br.readLine());
            String input = br.readLine();

            if(K >= input.length()){
              System.out.println(input);
            }else{
              input = input.substring(0, K);
              input = input + "...";
              System.out.println(input);
            }
        }

    }
}