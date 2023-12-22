import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      Set<String> set = new HashSet<>();
      for(int i = 0; i < N; i++){
        set.add(br.readLine());
      }
      System.out.println(set.size());
    }catch(Exception e){
    }
  }
}