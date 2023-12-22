import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      long N = Long.parseLong(S[0]);
      long M = Long.parseLong(S[1]);
      
      long mod = N%M;
      System.out.println(Math.min(mod, Math.abs(M-mod))); 
    }catch(Exception e){
    }
  }
}
