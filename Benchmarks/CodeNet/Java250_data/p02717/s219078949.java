import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");
          int[] result = new int[3];

          result[0] = Integer.parseInt(input[2]);
          result[1] = Integer.parseInt(input[0]);
          result[2] = Integer.parseInt(input[1]);

          System.out.println(result[0] + " " + result[1] + " " + result[2]);
        }
    }
}