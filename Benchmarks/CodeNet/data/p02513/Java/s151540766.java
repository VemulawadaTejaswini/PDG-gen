import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(br.ready()){
      String[] s = br.readLine().split(" ");
      for(String tmp : s){
        if(tmp.isEmpty()) continue;
        System.out.print("_");
        boolean digitFlg = tmp.matches(".*[0-9]+.*");
        boolean alphaFlg = tmp.matches(".*[a-zA-Z]+.*");
        if(digitFlg && alphaFlg){
          System.out.print("HYBRID");
        }
        else if(digitFlg){
          System.out.print("DIGIT");
        }
        else if(alphaFlg){
          System.out.print("WORD");
        }
      }
      System.out.println();
    }
  }
}