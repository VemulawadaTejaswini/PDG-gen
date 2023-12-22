import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = br.readLine();
      long N = Long.parseLong(S);
      long ans = 0;
      long a = N%500;
      ans += (N/500)*1000;
      ans += (a/5)*5;
      System.out.println(ans);
    }catch(Exception e){
    }
  }
}