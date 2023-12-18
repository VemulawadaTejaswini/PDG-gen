import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();
    int cnt = 0;
    while ((cnt < K - 1)) {
      if (S.charAt(cnt) != '1')
        break;
      cnt++;
    }
    System.out.println(S.charAt(cnt));

  }
}
