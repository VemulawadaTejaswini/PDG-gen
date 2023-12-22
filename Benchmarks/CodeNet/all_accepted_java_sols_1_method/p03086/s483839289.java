import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char[] c = {'A', 'T', 'G', 'C'};
    String ans = "", tmp = "";
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case 'A' :
        case 'T' :
        case 'C' :
        case 'G' :
          tmp += String.valueOf(str.charAt(i));
          break;
        default :
          if (ans.length() < tmp.length()) {
            ans = tmp;
          }
          tmp = "";
          break;
      }
    }
    if (ans.length() < tmp.length()) {
      System.out.println(tmp.length());
    } else {
      System.out.println(ans.length());
    }
  }
}