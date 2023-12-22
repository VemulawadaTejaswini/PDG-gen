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
    int answer = T.length();
    for (int i = 0; i <= S.length() - T.length(); i++) {
      int changesRequired = 0;
      for (int j = 0; j < T.length(); j++) {
        if (S.charAt(i + j) != T.charAt(j)) {
          changesRequired++;
        }
      }
      answer = Math.min(answer, changesRequired);
    }
    return answer;
  }
}
