import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str = br.readLine();
        int money = Integer.parseInt(str);
        int result = 0;
        int concern = 0;

        result = (int)Math.floor(money / 1.08);
        concern = (int)Math.floor(result * 1.08);

        if(concern == money){
          System.out.println(result);
        }else{
          concern = (int)Math.floor((result + 1) * 1.08);
          if(concern == money){
            System.out.println(result + 1);
          }else{
            System.out.println(":(");
          }
        }
      }
    }
}