import java.io.*;
import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input = br.readLine().split(" ");

          long A = Long.parseLong(input[0]);

          BigDecimal num = new  BigDecimal(input[1]);
          BigDecimal hum = new BigDecimal("100");
          BigDecimal mul = num.multiply(hum);       

          int tmp = mul.intValue();
          long result = 0;
          result = (A * tmp)/100;
          System.out.println(result);
        }

    }
}