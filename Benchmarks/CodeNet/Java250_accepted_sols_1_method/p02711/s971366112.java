import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = br.readLine();
      boolean f = S.charAt(0) == '7' || S.charAt(1) == '7' || S.charAt(2) == '7';
      System.out.println(f ? "Yes" : "No");
    }catch(Exception e){
    }
  }
}