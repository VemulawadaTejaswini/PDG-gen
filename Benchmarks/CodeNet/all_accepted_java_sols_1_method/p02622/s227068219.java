import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String S, T;
    int cnt = 0;
    Scanner sc = new Scanner(System.in);

    S = sc.next();
    T = sc.next();
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) != T.charAt(i)) {
        cnt++;
      }
    }
    System.out.print(cnt);
  }
}