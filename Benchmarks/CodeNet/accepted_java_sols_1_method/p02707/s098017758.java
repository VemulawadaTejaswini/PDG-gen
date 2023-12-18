import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      String[] S = br.readLine().split(" ");
      int[] val = new int[N];
      for(int i = 0; i < N-1; i++){
        int A = Integer.parseInt(S[i])-1;
        val[A]++;
      }
      for(int i : val){
        System.out.println(i);
      }
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }
}