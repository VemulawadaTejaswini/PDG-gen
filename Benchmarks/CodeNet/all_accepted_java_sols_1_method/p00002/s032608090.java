import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

  public static void main( String[] args ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = br.readLine();
    while (n != null) {
      String[] sp = n.split(" ");
      int result = 0;
      for (String str : sp) {
        try {
          result += Integer.parseInt(str);
        } catch (NumberFormatException ex) {
          result = 0;
        }
      }
      if (result == 0) {
        break;
      }
      System.out.println(String.valueOf(result).length());
      n = br.readLine();
    }
  }
}