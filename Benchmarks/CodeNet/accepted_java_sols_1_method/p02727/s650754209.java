import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int X = Integer.parseInt(S[0]);
      int Y = Integer.parseInt(S[1]);
      int Z = X+Y;
      int A = Integer.parseInt(S[2]);
      int B = Integer.parseInt(S[3]);
      int C = Integer.parseInt(S[4]);
      
      int[] red = new int[A];
      int[] green = new int[B];
      
      S = br.readLine().split(" ");
      for(int i = 0; i < A; i++){
          red[i] = Integer.parseInt(S[i]);
      }
      
      S = br.readLine().split(" ");
      for(int i = 0; i < B; i++){
          green[i] = Integer.parseInt(S[i]);
      }
      
      ArrayList<Integer> list = new ArrayList<>();
      S = br.readLine().split(" ");
      for(int i = 0; i < C; i++){
          list.add(Integer.parseInt(S[i]));
      }
      
      Arrays.sort(red);
      Arrays.sort(green);
      
      for(int i = 0; i < X; i++){
          list.add(red[A-i-1]);
      }
      for(int i = 0; i < Y; i++){
          list.add(green[B-i-1]);
      }
      Collections.sort(list);
      
      long ans = 0;
      for(int i = 0; i < Z; i++){
        ans += list.get(C+Z-i-1);
      }
      System.out.println(ans);
    }catch(Exception e){
    }
  }
}
