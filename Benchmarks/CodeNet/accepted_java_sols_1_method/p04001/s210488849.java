import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long total = 0;
    for (int i = 0; i < (1 << S.length() - 1); i++) {
      StringBuilder A = new StringBuilder();
      A.append(S.charAt(0));
      for (int j = 0; j < S.length() - 1; j++) {
        if ((1 & (i >> j)) == 1) {
          A.append("+");
        }
        A.append(S.charAt(j + 1));
      }
      String[] ss = A.toString().split("\\+");
      for (String s : ss) {
        total += Long.parseLong(s);
      }
    }
    System.out.println(total);
  }
}
