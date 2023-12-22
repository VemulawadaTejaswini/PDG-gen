import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        StringBuilder str_a = new StringBuilder();
        StringBuilder str_b = new StringBuilder();

        for(int i = 0; i < b; i++){
          str_a.append(input[0]);
        }

        for(int i = 0; i < a; i++){
            str_b.append(input[1]);
        }

        if(a == b){
          System.out.println(str_a);
        }else if(a > b){
          System.out.println(str_b);
        }else if(a < b){
          System.out.println(str_a);
        }
      }
    }
}