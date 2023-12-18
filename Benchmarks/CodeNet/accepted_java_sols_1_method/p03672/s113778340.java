import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuilder sb = new StringBuilder(S);
    int cnt = 0;
    for (int i = 0; i < S.length(); i++) {
      sb.deleteCharAt(sb.length() - 1);
      String formar = sb.substring(0, sb.length() / 2);
      String latter = sb.substring(sb.length() / 2, sb.length());
      if (formar.equals(latter)) {
        System.out.println(sb.length());
        break;
      }
    }
  }
}
