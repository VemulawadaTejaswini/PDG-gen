import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split("");
          int num = 0;

          if(input.length == 1){
            num = Integer.parseInt(input[0]);
          }else if(input.length == 2){
            num = Integer.parseInt(input[1]);
          }else if(input.length == 3){
            num = Integer.parseInt(input[2]);
          }

          if(num == 3){
            System.out.println("bon");
          }else if(num == 0 || num == 1 || num == 6 || num == 8){
            System.out.println("pon");
          }else{
            System.out.println("hon");
          }
        }

    }
}