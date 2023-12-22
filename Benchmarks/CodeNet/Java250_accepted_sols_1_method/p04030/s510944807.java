import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char[] cl = br.readLine().toCharArray();
      StringBuffer sb = new StringBuffer("");
      for (char c : cl){
        if (c == '0' || c == '1' ) {
          sb.append(c);
        } else {
          if(!sb.toString().isEmpty()){
            sb.delete(sb.toString().length() - 1,sb.toString().length());
          }
        }
      }
      System.out.println(sb.toString());
  }
}