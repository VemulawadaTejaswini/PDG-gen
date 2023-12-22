import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<>();
    boolean flag = true;
    String s = sc.next();
    map.put(s, 1);
    char s_last = s.charAt(s.length() - 1);
    for (int i = 1; i < n; i++) {
      s = sc.next();
      char s_first = s.charAt(0);
      if (map.containsKey(s)) {
        flag = false;
      }
      if (s_last != s_first) {
        flag = false;
      }
      map.put(s, 1);
      s_last = s.charAt(s.length() - 1);
    }
    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}