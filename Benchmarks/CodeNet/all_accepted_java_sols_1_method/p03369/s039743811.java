import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    int ans = 0;
    String s = sc.next();
    String[] m = s.split("");
    for (int i = 0; i < 3; i++) {
      if (("o").equals(m[i]))
        cnt++;
    }
    ans = 700 + 100 * cnt;
    System.out.println(ans);
  }
}