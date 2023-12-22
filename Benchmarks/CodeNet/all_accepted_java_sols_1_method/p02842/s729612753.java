import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = ":(";
    for (int i = 1; i <= N; i++) {
      double A = Math.floor(i * 1.08);

      if (A == N) {
        ans = String.valueOf(i);
        break;
      }
    }
    System.out.println(ans);
  }
}
