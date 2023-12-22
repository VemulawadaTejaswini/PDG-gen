import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int ans = 1;
    char pre = S.charAt(0);
    for (int i = 1; i < N; i++) {
      char cur = S.charAt(i);
      if (pre == cur) continue;
      pre = cur;
      ans++;
    }
    System.out.println(ans);
  }
}
