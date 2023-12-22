import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          double X = Double.parseDouble(br.readLine());
          double tmp = 100.0;
          int count = 0;

          do{
            tmp = tmp * 1.01;
            tmp = Math.floor(tmp);
            count++;
          }while(X > tmp);
          
          System.out.println(count);

        }
    }
}