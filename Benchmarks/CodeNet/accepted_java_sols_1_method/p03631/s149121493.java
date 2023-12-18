import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    StringBuffer sb = new StringBuffer(str);
    String s = sb.reverse().toString();
    System.out.println(s.equals(str)?"Yes":"No");
  }
}