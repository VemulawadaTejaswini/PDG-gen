import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] s = new int[n][26];

    for (int i = 0; i < n; i++) {
      String s_ = sc.next();
      for (int j = 0; j < s_.length(); j++) {
        s[i][(int) s_.charAt(j) - 97]++;
      }
    }

    sc.close();

    for (int i = 0; i < 26; i++) {
      int min = 100;
      for (int j = 0; j < n; j++) {
        min = Math.min(min, s[j][i]);
      }
      for (int k = 0; k < min; k++) {
        System.out.print(String.valueOf((char) (i+97)));
      }
    }

    System.out.println("");

  }

}