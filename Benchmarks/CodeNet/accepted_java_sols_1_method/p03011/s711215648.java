import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int ans = 0;
    ans = Math.min((p + q), Math.min(q + r, r + p));
    System.out.println(ans);
  }
}