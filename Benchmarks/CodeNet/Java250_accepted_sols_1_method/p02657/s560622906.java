import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] num = br.readLine().split(" ");
          int A = Integer.parseInt(num[0]);
          int B = Integer.parseInt(num[1]);

          System.out.println(A*B);
        }
    }
}