import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        long H = Long.parseLong(br.readLine());
        long result = culcurate(H);
        
        System.out.println(result);
      }
    }

    public static long culcurate(long h){
      if(h == 1){
        return 1;
      }
      return 2*culcurate(h / 2) + 1;
    }
} 