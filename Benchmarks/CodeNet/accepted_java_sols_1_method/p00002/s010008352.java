import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s="";
    while(s != null) {
      s = br.readLine();
      if (s == null ){break;}
      int a = Integer.parseInt(s.split(" ")[0]);
      int b = Integer.parseInt(s.split(" ")[1]);
      System.out.println(String.valueOf(a + b).length());
    }
  }
}