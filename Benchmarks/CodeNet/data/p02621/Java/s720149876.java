import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(br.readLine());
      int ans = a + (int)Math.pow(a,2) + (int)Math.pow(a,3);
      System.out.println(ans);
    }catch(IOException e){
       System.out.println(e);
    }
  }
}