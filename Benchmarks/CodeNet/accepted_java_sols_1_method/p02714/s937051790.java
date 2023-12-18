import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      String S = br.readLine();
      long r = 0, g = 0, b = 0;
      for(int i = 0; i < N; i++){
        char c = S.charAt(i);
        if(c == 'R'){
          r++;
        }else if(c == 'G'){
          g++;
        }else{
          b++;
        }
      }
      
      long ans = r * g * b;
      for(int i = 0; i < N; i++){
        char c1 = S.charAt(i);
        for(int j = i+1; j < N; j++){
          if(j+(j-i) >= N) break;
          char c2 = S.charAt(j);
          char c3 = S.charAt(j+(j-i));
          if(c1 != c2 && c2 != c3 && c1 != c3){
            ans--;
          }
        }
      }
      System.out.println(ans);
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }
}