import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    int o1 = 0;
    int e1 = 0;
    for (int i = 0; i < S.length(); i += 2) {
      if (S.charAt(i) == '1') {
        o1++;
      }
    }
    for (int i = 1; i < S.length(); i += 2) {
      if (S.charAt(i) == '1') {
        e1++;
      }
    }
    int o0 = (S.length() + 1) / 2 - o1;
    int e0 = S.length() / 2 - e1;
    int ans = Math.min(o0 + e1, o1 + e0);
    System.out.println(ans);
  }

}
