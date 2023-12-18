import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      System.out.println(2*N*Math.PI);
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }
}
