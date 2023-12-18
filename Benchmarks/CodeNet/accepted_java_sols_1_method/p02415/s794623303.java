/* ITP1_8_A */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String str = br.readLine();

      for(char c : str.toCharArray()){
        if(Character.isUpperCase(c)){
          sb.append(Character.toLowerCase(c));
        }else if(Character.isLowerCase(c)){
          sb.append(Character.toUpperCase(c));
        }else {
          sb.append(c);
        }
      }
      System.out.println(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}