/* ITP1_8_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      String p = br.readLine();
      int s_len = s.length();
      int p_len = p.length();
      if(s_len < p_len) return;

      String ss = s + s;
      boolean judge = false;

      // CHECK
      for(int i = 0; i < s_len; i++){
        if(s.charAt(i) == p.charAt(0)){
          if(p.equals(ss.substring(i, i + p_len))){
            judge = true;
            break;
          }
        }
      }
      // OUTPUT
      if(judge)
        System.out.println("Yes");
      else
        System.out.println("No");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}