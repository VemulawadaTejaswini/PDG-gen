import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    sc.close();

    char[] ans = new char[N * 2];
    for (int i = 0; i < N; i++) {
      ans[i * 2] = S.charAt(i);
      ans[i * 2 + 1] = T.charAt(i);
    }
    System.out.println(new String(ans));
  }
}