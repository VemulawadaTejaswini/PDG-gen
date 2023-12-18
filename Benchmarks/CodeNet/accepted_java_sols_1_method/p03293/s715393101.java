import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    String s_rt = "";
    boolean flg = false;
    for(int i=0; i<s.length(); i++) {
      s_rt = s.substring(s.length()-i,s.length()) + s.substring(0,s.length()-i);
      if(s_rt.equals(t))
        flg = true;
    }
    System.out.println(flg==true?"Yes":"No");
  }
}