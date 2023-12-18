import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");

          long A = Long.parseLong(input[0]);
          double B = Double.parseDouble(input[1]);

          long result = 0;

          result = (A * (long)(100 * B))/100;

          System.out.println(result);
        }

    }
}