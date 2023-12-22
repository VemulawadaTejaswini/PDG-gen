import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int[] chars = new int[26];
    while (stdin.hasNext()) {
      String str = stdin.next();
      int len = str.length();
      for (int i = 0; i < len; i++) {
        int j = Character.toLowerCase(str.charAt(i)) - 97;
        if (j >= 0 && j < 26) {
          chars[j]++;
        }
      }
    }

    for (int i = 0; i < 26; i++) {
      System.out.printf("%s : %d%n", (char) (i + 97), chars[i]);
    }
  }

}