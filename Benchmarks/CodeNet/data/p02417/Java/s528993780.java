import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] n = new int[26];

    String line;
      char[] c = line.toCharArray();
      int len = c.length;

      for(int i = 0; i < len; i++) {
        for(int j = 0; j < 26; j++) {
          if(c[i] == (char)('a' + j) || c[i] == (char)('A' + j)) {
            n[j] += 1;
            break;
          }
        }
      }

    for(int i = 0; i < 26; i++) {
      char C = (char)('a' + i);
      System.out.println(C + " : " + n[i]);
    }

  }
}