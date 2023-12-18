/* ITP1_8_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String s = br.readLine();
      String p = br.readLine();
      int s_len = s.length();
      int p_len = p.length();
      if(s_len < p_len) return;

      char[] s_char = s.toCharArray();
      boolean judge = false;

      for(int i = 0; i < s_len; i++){
        if(s_char[i] == p.charAt(0)){
          // CHECK
          if( ((i + 1) + p_len) > s_len ){
            sb.append(s.substring(i, s_len));
            sb.append(s.substring(0, (p_len - (s_len - i)) ));
          }else {
            sb.append(s.substring(i, i + p_len));
          }
          // JUDGE
          if(p.equals(sb.toString())){
            judge = true;
            break;
          }
          sb.delete(0, sb.length());
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