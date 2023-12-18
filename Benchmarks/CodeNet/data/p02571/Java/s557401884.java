import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String S = s.next();
    String T = s.next();
    System.out.println(changesRequired(S, T));
    s.close();
  }

  private static Integer changesRequired(String S, String T) {
    int ans = T.length();
    for (int start = 0; start <= S.length() - T.length(); start++) {
      int diff = 0;
      for (int i = 0; i < T.length(); i++) {
        if (T.charAt(i) != S.charAt(start + i)) {
          diff++;
        }
      }
      ans = Math.min(ans, diff);
    }
    return ans;
  }
}
