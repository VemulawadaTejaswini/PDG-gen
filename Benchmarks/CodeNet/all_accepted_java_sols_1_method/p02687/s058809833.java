import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String str = br.readLine();

          if(str.equals("ABC")){
            System.out.println("ARC");
          }else if(str.equals("ARC")){
            System.out.println("ABC");
          }

      }
    }
}