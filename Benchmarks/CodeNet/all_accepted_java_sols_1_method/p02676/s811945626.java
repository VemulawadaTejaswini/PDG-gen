import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    sc.close();

    String ans = K < S.length() ?  S.substring(0, K) + "..." : S;
    System.out.println(ans);
  }
}
