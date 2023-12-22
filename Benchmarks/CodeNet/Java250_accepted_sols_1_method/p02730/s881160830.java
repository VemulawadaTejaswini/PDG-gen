import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_len = s.length();
    if(s.substring(0,(s_len-1)/2).equals(s.substring((s_len+1)/2,s_len))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}