import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      
      System.out.println(S[2]+" "+S[0]+" "+S[1]); 
    }catch(Exception e){
    }
  }
}
