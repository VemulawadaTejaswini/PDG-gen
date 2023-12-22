import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int ans = 0;
    for (int i = 0; i < N.length(); i++) {
      if (N.charAt(i) == '2') {
        ans++;
      }
    }
    System.out.println(ans);
  }
}