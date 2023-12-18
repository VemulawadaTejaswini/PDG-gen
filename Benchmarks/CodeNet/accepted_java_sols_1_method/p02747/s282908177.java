import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = br.readLine();
      String s1 = "hi";
      String s2 = "hihi";
      String s3 = "hihihi";
      String s4 = "hihihihi";
      String s5 = "hihihihihi";
      boolean f = S.equals(s1) || S.equals(s2) || S.equals(s3) || S.equals(s4) || S.equals(s5);
      System.out.println(f ? "Yes" : "No");
    }catch(Exception e){
    }
  }
}