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
      if(s.length() < p.length()) return;
      boolean judge = false;

      char[] s_char = s.toCharArray();

      for(int i = 0; i < s.length(); i++){
        if(s_char[i] == p.charAt(0)){
          if( ((i + 1) + p.length()) > s.length() ){
            sb.append(s.substring(i, s.length()));
            sb.append(s.substring(0, (p.length() - (s.length() - i))));
          }else {
            sb.append(s.substring(i, i + p.length()));
          }
          if(p.equals(sb.toString())) judge = true;
          //System.out.println("i:" + i + " p:" + p + " sb:" + sb + " judge:" + judge);
          sb.delete(0, sb.length());
        }
      }

      if(judge)
        System.out.println("Yes");
      else
        System.out.println("No");

    }catch(Exception e){
      System.out.println(e);
    }
  }
}