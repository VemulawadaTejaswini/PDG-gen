import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        int n = Integer.parseInt(br.readLine());;
        String str = br.readLine();

        if(n%2 != 0){
          System.out.println("No");
        }else{
          String tmp_str = str.substring(0, n/2);
          tmp_str = tmp_str + tmp_str;
          if(str.equals(tmp_str)){
            System.out.println("Yes");
          }else{
            System.out.println("No"); 
          }
        }
        
      }
    }
}