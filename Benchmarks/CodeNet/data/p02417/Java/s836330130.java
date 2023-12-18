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
      int[] chars = new int[26];

      for (int i = 0; i < len; i++) {
        int j = Character.toLowerCase(str.charAt(i)) - 97;
        if (j >= 0 && j < 26) {
          chars[j] += 1;
        }
      }

      for (int i = 0; i < 26; i++) {
        System.out.printf("%s : %d%n", (char) (i + 97), chars[i]);
      }
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