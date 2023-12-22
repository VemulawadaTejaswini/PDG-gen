import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    BufferedReader stdin = null;
    try {
      stdin = new BufferedReader(new InputStreamReader(System.in));
      String str = stdin.readLine();
      int len = str.length();
      char[] chars = new char[len];

      for (int i = 0; i < len; i++) {
        char ch = str.charAt(i);
        if (Character.isUpperCase(ch)) {
          chars[i] = Character.toLowerCase(ch);
        } else if (Character.isLowerCase(ch)) {
          chars[i] = Character.toUpperCase(ch);
        } else {
          chars[i] = ch;
        }
      }

      System.out.println(chars);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (stdin != null) {
          stdin.close();
        }
      } catch (IOException e) {
      }
    }
  }

}