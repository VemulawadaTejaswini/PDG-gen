import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int[] R1 = new int[26];
    int[] R2 = new int[26];
    for (int i = 0; i < 26; i++) {
      R1[i] = -1;
      R2[i] = -1;
    }
    boolean flag = true;
    for (int i = 0; i < S.length(); i++) {
      if (R1[S.charAt(i) - 'a'] < 0) {
        R1[S.charAt(i) - 'a'] = T.charAt(i) - 'a';
      } else {
        if (R1[S.charAt(i) - 'a'] != T.charAt(i) - 'a') {
          flag = false;
        }
      }
      if (R2[T.charAt(i) - 'a'] < 0) {
        R2[T.charAt(i) - 'a'] = S.charAt(i) - 'a';
      } else {
        if (R2[T.charAt(i) - 'a'] != S.charAt(i) - 'a') {
          flag = false;
        }
      }
    }
    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}