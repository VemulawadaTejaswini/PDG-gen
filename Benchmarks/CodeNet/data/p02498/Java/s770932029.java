import java.io.*;
import java.util.*;


public class Main{
  public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      String line = buf.readLine();
      String result = "";
      char[] CHarray = line.toCharArray();
      for(int i=0; i<CHarray.length; i++){
        if(Character.isLowerCase(CHarray[i])){
          result += (String.valueOf(CHarray[i])).toUpperCase();
        }else{
          result += (String.valueOf(CHarray[i])).toLowerCase();
        }
    }
    System.out.println(result);
  }
}